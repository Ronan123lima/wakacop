package acadamy.wakanda.wakacop.sessaovotacao.application.service;

import acadamy.wakanda.wakacop.sessaovotacao.application.api.*;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
    ResultadoSessaoResponse obtemResultado(UUID idSessao);
}
