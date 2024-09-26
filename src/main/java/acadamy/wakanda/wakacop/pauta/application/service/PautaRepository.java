package acadamy.wakanda.wakacop.pauta.application.service;

import acadamy.wakanda.wakacop.pauta.domain.Pauta;

import java.util.UUID;

public interface PautaRepository {
    Pauta salva(Pauta pauta);
    Pauta buscaPautaPorId(UUID idPauta);
}
