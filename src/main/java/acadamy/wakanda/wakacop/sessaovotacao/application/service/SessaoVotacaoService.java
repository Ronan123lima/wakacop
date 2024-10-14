package acadamy.wakanda.wakacop.sessaovotacao.application.service;

import acadamy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.VotoRequest;
import acadamy.wakanda.wakacop.sessaovotacao.application.api.VotoResponse;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
}
