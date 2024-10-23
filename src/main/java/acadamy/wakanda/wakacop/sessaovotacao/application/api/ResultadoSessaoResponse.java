package acadamy.wakanda.wakacop.sessaovotacao.application.api;

import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
public class ResultadoSessaoResponse {
    private UUID id;
    private UUID idPauta;
    private LocalDateTime momentoAbertura;
    private LocalDateTime momentoEncerramento;
    private Long totalVotos;
    private Long totalSim;
    private Long totalNao;

    public ResultadoSessaoResponse(SessaoVotacao sessao) {
        this.id = sessao.getId();
        this.idPauta = sessao.getIdPauta();
        this.momentoAbertura = sessao.getMomentoAbertura();
        this.momentoEncerramento = sessao.getMomentoEncerramento();
        this.totalVotos = sessao.getTotalVotos();
        this.totalSim = sessao.getTotalSim();
        this.totalNao = sessao.getTotalNao();
    }
}
