package me.deen.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TheController {

    @RequestMapping("/")
    public String showFirstRoute() {
        return "Index";
    }

    @RequestMapping("/")
    public String showSecondRoute() {
        return "Gallery";
    }
    @RequestMapping("/toWings")
    public String showThirdRoute() {
        return "Wings";
    }
    @RequestMapping("/toEggSauce")
    public String showFourthRoute() {
        return "EggSauce";
    }
    @RequestMapping("/toInjera")
    public String showFifthRoute() {
        return "Injera";
    }
    @RequestMapping("/toCrabCakes")
    public String showSixthRoute() {
        return "CrabCake";
    }
    @RequestMapping("/toPumpkinNoodles")
    public String showSeventhRoute() {
        return "PumpkinNoodles";
    }
    @RequestMapping("/toGimbap")
    public String showEighthRoute() {
        return "Gimbap";
    }
}