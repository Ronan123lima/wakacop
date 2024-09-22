package acadamy.wakanda.wakacop.sessaovotacao.application.service;

import acadamy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}
