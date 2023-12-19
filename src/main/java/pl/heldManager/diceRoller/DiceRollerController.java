package pl.heldManager.diceRoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class DiceRollerController {

    public int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max- min) +min;
    }

    @RequestMapping("/diceRoll")
    public String rollingDice(@RequestParam(required = false) String dice){
        if (!(dice ==null)){
            return String.valueOf(getRandomNumber(1,Integer.parseInt(dice)+1));
        } else {
            return "/chooseDice";
        }
    }
    @RequestMapping("/chooseDice")
    public String chooseDice(){
        return "diceRoll";
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
