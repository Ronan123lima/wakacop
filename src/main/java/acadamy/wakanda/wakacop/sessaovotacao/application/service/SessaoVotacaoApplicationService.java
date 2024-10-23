package acadamy.wakanda.wakacop.sessaovotacao.application.service;

import acadamy.wakanda.wakacop.pauta.application.service.PautaService;
import acadamy.wakanda.wakacop.pauta.domain.Pauta;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.*;
import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import acadamy.wakanda.wakacop.sessaovotacao.domain.VotoPauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoVotacaoRepository sessaVotacaoRepository;
    private final PautaService pautaService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
       log.info("[start] SessaoVotacaoApplicationService - abreSessao");
       Pauta pauta = pautaService.getPautaPorId(sessaoAberturaRequest.getIdPauta());
       SessaoVotacao sessaoVotacao = sessaVotacaoRepository.salva(new SessaoVotacao (sessaoAberturaRequest, pauta));
       log.info("[finish] SessaoVotacaoApplicationService - abreSessao");
       return new SessaoAberturaResponse(sessaoVotacao);
    }

    @Override
    public VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto) {
        log.info("[start SessaoVotacaoApplicationService - recebeVoto ");
        SessaoVotacao sessao = sessaVotacaoRepository.buscaPorId(idSessao);
        VotoPauta voto = sessao.recebeVoto(novoVoto);
        sessaVotacaoRepository.salva(sessao);
        log.info("[finish SessaoVotacaoApplicationService - recebeVoto ");
        return new VotoResponse(voto);
    }
    @Override
    public ResultadoSessaoResponse obtemResultado(UUID idSessao) {
        log.info("[start] SessaoVotacaoApplicationService - obtemResultado");
        SessaoVotacao sessao = sessaVotacaoRepository.buscaPorId(idSessao);
        ResultadoSessaoResponse resultado = sessao.obtemResultado();
        sessaVotacaoRepository.salva(sessao);
        log.info("[finish] SessaoVotacaoApplicationService - obtemResultado");
        return resultado;
    }
}
