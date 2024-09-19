package acadamy.wakanda.wakacop.pauta.application.service;

import acadamy.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import acadamy.wakanda.wakacop.pauta.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}
