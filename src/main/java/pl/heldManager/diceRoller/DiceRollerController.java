package pl.heldManager.diceRoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class DiceRollerController {

    public int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max- min) +min;
    }

    @PostMapping("/diceRoll")
    @ResponseBody
    public String playerRollsTheDice(@RequestParam(required = false) long player,
                                     @RequestParam String dice){
        System.out.println(dice);
        return String.valueOf(getRandomNumber(1,Integer.parseInt(dice.substring(1))+1));

    }

    @RequestMapping("/diceRoll")
    public String rollingDice(@RequestParam(required = false) String dice){
        if (!(dice ==null)){
            return String.valueOf(getRandomNumber(1,Integer.parseInt(dice)+1));
        } else {
            return "/diceRoll1";
        }
    }
    @RequestMapping("/chooseDice")
    public String chooseDice(){
        return "diceRoll1";
    }

    @GetMapping("/k100")
    @ResponseBody
    public String rollK100(){
        return String.valueOf(getRandomNumber(1, 101));
    }
    @GetMapping("/k20")
    @ResponseBody
    public String rollK20(){
        return String.valueOf(getRandomNumber(1,21));
    }
    @GetMapping("/k6")
    @ResponseBody
    public String rollK6(){
        return String.valueOf(getRandomNumber(1,7));
    }
    @GetMapping("/k4")
    @ResponseBody
    public String rollK4(){
        return String.valueOf(getRandomNumber(1,5));
    }
    @GetMapping("/k3")
    @ResponseBody
    public String rollK3(){
        return String.valueOf(getRandomNumber(1,4));
    }

    @GetMapping("/k2")
    @ResponseBody
    public String rollK2(){
        return String.valueOf(getRandomNumber(1,3));
    }

    @GetMapping("/k10")
    @ResponseBody
    public String rollK10(){
        return String.valueOf(getRandomNumber(1,11));
    }

}
