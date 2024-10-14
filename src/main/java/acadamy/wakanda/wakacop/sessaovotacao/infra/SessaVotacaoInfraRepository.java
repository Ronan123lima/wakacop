package acadamy.wakanda.wakacop.sessaovotacao.infra;

import acadamy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoRepository;
import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaVotacaoInfraRepository implements SessaoVotacaoRepository {
    private final SessaoVotacaoSpringDataJPARepository sessaoVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[start] SessaVotacaoInfraRepository - salva ");
        sessaoVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.info("[finish] SessaVotacaoInfraRepository - salva ");
        return sessaoVotacao;
    }

    @Override
    public SessaoVotacao buscaPorId(UUID idSessao) {
        log.info("[start] SessaVotacaoInfraRepository - buscaPorId ");
        SessaoVotacao sessao = sessaoVotacaoSpringDataJPARepository.findById(idSessao)
                        .orElseThrow(() -> new RuntimeException("Sessão não encontrada!"));
        log.info("[finish] SessaVotacaoInfraRepository - buscaPorId ");
        return sessao;
    }
}
