package pl.heldManager.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.heldManager.createCharacter.Character;
import pl.heldManager.createCharacter.CharacterDao;
import pl.heldManager.player.Player;
import pl.heldManager.player.PlayerController;
import pl.heldManager.player.PlayerDao;

import java.util.List;
import java.util.Objects;

@Transactional
@Controller
public class GameController {
    private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);

    private final GameDao gameDao;
    private final PlayerDao playerDao;

    public GameController(GameDao gameDao, PlayerDao playerDao) {
        this.gameDao = gameDao;
        this.playerDao = playerDao;
    }

    @GetMapping("/newGame")
    public String createNewGame(Model model) {
            List<Game> games = gameDao.findAll();
            model.addAttribute("games", games);

            return "newGame";
        }

    @GetMapping("/showAllGames")
    public String showAllGames(Model model) {
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);

        System.out.println("---------------------------");
        System.out.println(model);
        return "gamesMenu";
    }
    @GetMapping("/addPlayerToGame")
    public String addPlayerToGame(Model model) {
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);

        List<Player> players = playerDao.findAll();
        model.addAttribute("players", players);
        System.out.println("---------------------------");
        System.out.println(model);
        return "gamesMenu";
    }

    @RequestMapping("/deleteGame")
    public String deleteGame(Model model, @RequestParam long id) {
            gameDao.deleteById(id);
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);
            return "gamesMenu";
        }

    @GetMapping("/editGameData")
    public String updateGame(Model model, @RequestParam long id) {
        Game game = gameDao.getOne(id);
        model.addAttribute("gameToEdit", game);
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);
        return "gamesMenu";
    }
    }

