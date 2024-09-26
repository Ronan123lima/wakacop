package acadamy.wakanda.wakacop.pauta.application.service;

import acadamy.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import acadamy.wakanda.wakacop.pauta.application.api.PautaCadastradaResponse;
import acadamy.wakanda.wakacop.pauta.domain.Pauta;

import java.util.UUID;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);

    Pauta getPautaPorId(UUID idPauta);
}
