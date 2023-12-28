package pl.heldManager.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        List<Player> players = playerDao.findAll();
        model.addAttribute("players", players);

        return "newGame";
    }

    @PostMapping("/newGame")
    public String postNewGame(Model model,
                              @RequestParam String gameStatus,
                              @RequestParam String gameSystem,
                              @RequestParam long playerId){
        System.out.println("---------------");
        System.out.println(gameSystem);
        System.out.println(gameStatus);
        System.out.println(playerId);
        System.out.println("---------------");

        Game game = new Game();
        game.setMaster(playerDao.getOne(playerId));
        game.setGameSystem(gameSystem);
        game.setStatus(gameStatus);
        System.out.println("---------------");
        System.out.println(game.getId());
        System.out.println(game.getGameSystem());
        System.out.println(game.getStatus());
        System.out.println(game.getMaster());

        gameDao.save(game);
        return "redirect:/showAllGames";
    }

    @GetMapping("/showAllGames")
    public String showAllGames(Model model) {
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);
        return "gamesMenu";
    }

    //@TODO

    //    @GetMapping("/addPlayerToGame")
//    public String addPlayerToGame(Model model) {
//        List<Game> games = gameDao.findAll();
//        model.addAttribute("games", games);
//
//        List<Player> players = playerDao.findAll();
//        model.addAttribute("players", players);
//        System.out.println("---------------------------");
//        System.out.println(model);
//        return "gamesMenu";
//    }

    @RequestMapping("/deleteGame")
    public String deleteGame(Model model, @RequestParam long id) {
        gameDao.deleteById(id);
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);
        return "gamesMenu";
    }

    @GetMapping("/updateGame")
    public String updateGameGet(Model model, @RequestParam long id) {
        Game game = gameDao.getOne(id);
        model.addAttribute("gameToEdit", game);
        List<Game> games = gameDao.findAll();
        model.addAttribute("games", games);

        List<Player> players = playerDao.findAll();
        model.addAttribute("players", players);

        return "updateGame";
    }

    @PostMapping("/updateGame")
    public String updateGamePost(Model model, @RequestParam String gameSystem, @RequestParam String gameStatus, @RequestParam long id, @RequestParam long playerId) {
        Game game = gameDao.getOne(id);
        game.setStatus(gameStatus);
        game.setGameSystem(gameSystem);
        game.setMaster(playerDao.getOne(playerId));
        gameDao.save(game);

        return "redirect:/showAllGames";
    }
}

