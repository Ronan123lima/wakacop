package acadamy.wakanda.wakacop.sessaovotacao.application.api;

import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;
@Getter
@ToString
public class SessaoAberturaResponse {
    private UUID idSessao;
    public SessaoAberturaResponse(SessaoVotacao sessaoVotacao) {
        this.idSessao = sessaoVotacao.getId();
    }
}
