package acadamy.wakanda.wakacop.sessaovotacao.infra;

import acadamy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoVotacaoSpringDataJPARepository extends JpaRepository<SessaoVotacao, UUID> {
}
