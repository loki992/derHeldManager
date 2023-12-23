package pl.heldManager.game;

import antlr.LexerSharedInputState;
import pl.heldManager.player.Player;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<Player> playersList = new ArrayList<>();

    @ManyToOne
    private Player Master;

    private String system;



}
