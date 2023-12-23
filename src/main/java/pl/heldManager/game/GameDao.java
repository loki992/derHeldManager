package pl.heldManager.game;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.heldManager.player.Player;

public interface GameDao extends JpaRepository<Game, Long> {
}
