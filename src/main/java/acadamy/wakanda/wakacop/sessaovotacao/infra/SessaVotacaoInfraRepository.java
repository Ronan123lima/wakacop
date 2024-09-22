package acadamy.wakanda.wakacop.sessaovotacao.infra;

import acadamy.wakanda.wakacop.sessaovotacao.application.service.SessaVotacaoRepository;
import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaVotacaoInfraRepository implements SessaVotacaoRepository {
    private final SessaoVotacaoSpringDataJPARepository sessaoVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.info("[start] SessaVotacaoInfraRepository - salva ");
        sessaoVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.info("[finish] SessaVotacaoInfraRepository - salva ");
        return sessaoVotacao;
    }
}
