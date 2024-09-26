package acadamy.wakanda.wakacop.sessaovotacao.application.service;

import acadamy.wakanda.wakacop.pauta.application.service.PautaService;
import acadamy.wakanda.wakacop.pauta.domain.Pauta;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaVotacaoRepository sessaVotacaoRepository;
    private final PautaService pautaService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
       log.info("[start] SessaoAberturaResponse - abreSessao");
       Pauta pauta = pautaService.getPautaPorId(sessaoAberturaRequest.getIdPauta());
       SessaoVotacao sessaoVotacao = sessaVotacaoRepository.salva(new SessaoVotacao (sessaoAberturaRequest, pauta));
       log.info("[finish] SessaoAberturaResponse - abreSessao");
       return new SessaoAberturaResponse(sessaoVotacao);
    }
}
