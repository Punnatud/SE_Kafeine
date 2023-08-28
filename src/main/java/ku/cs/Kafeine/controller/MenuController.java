package ku.cs.Kafeine.controller;

import ku.cs.Kafeine.model.MenuRequest;
import ku.cs.Kafeine.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public String getAllMenus(Model model){
        model.addAttribute("menus", menuService.getAllMenus());
        return "menu-all";
    }

    @GetMapping("/add")
    public String getAddMenuPage(Model model){
        return "menu-add";
    }
    @PostMapping("/add")
    public String create(@ModelAttribute MenuRequest menu, Model model){
        menuService.create(menu);
        model.addAttribute("menus", menuService.getAllMenus());
        return "redirect:/menus";
    }
}
