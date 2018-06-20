package me.deen.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TheController {

    @RequestMapping("/Index")
    public String showFirstRoute() {
        return "Index";
    }

    @RequestMapping("/Gallery")
    public String showSecondRoute() {
        return "Gallery";
    }
    @RequestMapping("/Wings")
    public String showThirdRoute() {
        return "Wings";
    }
    @RequestMapping("/EggSauce")
    public String showFourthRoute() {
        return "EggSauce";
    }
    @RequestMapping("/Injera")
    public String showFifthRoute() {
        return "Injera";
    }
    @RequestMapping("/CrabCakes")
    public String showSixthRoute() {
        return "CrabCake";
    }
    @RequestMapping("/PumpkinNoodles")
    public String showSeventhRoute() {
        return "PumpkinNoodles";
    }
    @RequestMapping("/Gimbap")
    public String showEighthRoute() {
        return "Gimbap";
    }
}