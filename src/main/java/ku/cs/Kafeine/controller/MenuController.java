package ku.cs.Kafeine.controller;

import ku.cs.Kafeine.entity.Menu;
import ku.cs.Kafeine.model.MenuRequest;
import ku.cs.Kafeine.service.CategoryService;
import ku.cs.Kafeine.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public String getAllMenus(Model model){
        model.addAttribute("categories", categoryService.getAllCategories());
        return "menu-all";
    }

    @GetMapping("/{id}")
    public String getOneMenu(@PathVariable UUID id, Model model){
        Menu menu = menuService.getOnebyId(id);
        model.addAttribute("menu", menu);
        return "menu-view";
    }
    @GetMapping("/add")
    public String getAddMenuPage(Model model){
        model.addAttribute("categories", categoryService.getAllCategories());
        return "menu-add";
    }
    @PostMapping("/add")
    public String create(@ModelAttribute MenuRequest menu, Model model){
        menuService.create(menu);
        model.addAttribute("categories", categoryService.getAllCategories());
        return "redirect:/menus";
    }
}
