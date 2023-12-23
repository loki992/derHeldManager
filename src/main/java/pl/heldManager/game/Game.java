package pl.heldManager.game;

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
    @Column(nullable = false)
    private String system;

    @Column(nullable = false)

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
    }

    public Player getMaster() {
        return Master;
    }

    public void setMaster(Player master) {
        Master = master;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Game() {
    }
}
