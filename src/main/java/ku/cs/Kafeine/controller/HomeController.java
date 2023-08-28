package ku.cs.Kafeine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("greeting","Tuk Krub");
        return "home";
    }
}
