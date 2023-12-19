package pl.heldManager.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class PlayerController {
    private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);
    private final PlayerDao playerDao;
    public PlayerController(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }
    @GetMapping("/newPlayer")
    public String newPlayerForm() {
        return "newPlayer";
    }
    @PostMapping("/newPlayer")
    @ResponseBody
    public String newPlayer(@RequestParam String email, @RequestParam String pass, @RequestParam String nick) {
        Player player = new Player();
        player.setLogin(nick);
        player.setPassword(pass);
        player.setEmail(email);
        playerDao.save(player);
        return "Id dodanego gracza to:"
                + player.getId();
    }

}
