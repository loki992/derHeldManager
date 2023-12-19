package pl.heldManager.createCharacter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.heldManager.player.Player;
import pl.heldManager.player.PlayerController;
import pl.heldManager.player.PlayerDao;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Transactional
@Controller
public class CharacterController {

    private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);

    private final CharacterDao characterDao;
    private final PlayerDao playerDao;

    public CharacterController(CharacterDao characterDao, PlayerDao playerDao) {
        this.characterDao = characterDao;
        this.playerDao = playerDao;
    }


    @GetMapping("/showAllChars")
    public String showAllCharacters(Model model) {
        List<Character> characters = characterDao.findAll();
//        HashMap<Integer, String> outputCharacters = new HashMap<>();
//        for (int i = 0; i < characters.size(); i++) {
//            outputCharacters.put(characters.get(i).getId(),characters.get(i).getName() +" "+ characters.get(i).getSurname());
//            System.out.println(characters.get(i).getId() + characters.get(i).getName() + characters.get(i).getSurname());
//        }

        model.addAttribute("characters", characters);

        System.out.println("---------------------------");
        System.out.println(model);
        return "showAll";
    }

    @GetMapping("/newCharacter")
    public String newCharacterForm(Model model) {
        List<Player> players = playerDao.findAll();
        model.addAttribute("players", players);

        return "new";
    }

    @RequestMapping("/show")
    public String showCharacterSheet(Model model, @RequestParam(name="id") String characterId){
        Character character = characterDao.getOne(Long.valueOf(characterId));
        model.addAttribute("character",character);
//                findById(Long.valueOf(characterId)));
        model.addAttribute("owner",playerDao.getOne(character.getPlayerId()));
//
        System.out.println("-------------------////-------------");
        System.out.println(characterId);
        System.out.println("-------------------////-------------");
        System.out.println(characterDao.getOne(Long.valueOf(characterId)));
        System.out.println("-------------------////-------------");
        return "showCharacterSheet";
    }

    @PostMapping("/newCharacter")
    public String newCharacter(@RequestParam int age,
                               @RequestParam String birthPlace,
                               @RequestParam int dex,
                               @RequestParam int edu,
                               @RequestParam int fit,
                               @RequestParam int hp,
//                               @RequestParam BASIC SKILLS,
                               @RequestParam String job,
                               @RequestParam String homeCity,
                               @RequestParam int mov,
                               @RequestParam int looks,
                               @RequestParam int luck,
                               @RequestParam int intel,
                               @RequestParam int mp,
//                               @RequestParam int sex,
                               @RequestParam String charName,
                               @RequestParam int phys,
                               @RequestParam long player,
                               @RequestParam int pw,
                               @RequestParam int sanity,
                               @RequestParam int str,
                               @RequestParam String charSurname,
                               Model model) {
        Character character = new Character();
        character.setPlayer(playerDao.getOne(player));
        character.setAge(age);
        character.setBirthCity(birthPlace);
        character.setDexterity(dex);
        character.setEducation(edu);
        character.setFitness(fit);
        character.setHp(hp);
        character.setJob(job);
        character.setHomeCity(homeCity);
        character.setMovement(mov);
        character.setLooks(looks);
        character.setLuck(luck);
        character.setInteligence(intel);
        character.setMp(mp);
//        character.setSex_male();
        character.setName(charName);
        character.setPhysique(phys);
//        character.setPlayer();
        character.setPower(pw);
        character.setSanity(sanity);
        character.setStrength(str);
        character.setSurname(charSurname);

        characterDao.save(character);
        model.addAttribute("charId", character.getId());
        return "created";
    }

    @RequestMapping("delete")
    public String deleteChar(Model model, @RequestParam long id, @RequestParam String sure) {
        if(Objects.equals(sure, "yes")){
            characterDao.deleteById(id);
            return "done";
        }else {
            model.addAttribute("id",id);
            return "deleteCharacter";

        }
    }
    @GetMapping("update")
    public String updateChar(Model model, @RequestParam long id) {
        Character character = characterDao.getOne(id);
        model.addAttribute("characterToEdit", character);
        System.out.println(character.getName());
            return "updateCharacter";
        }



}
