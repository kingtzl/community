package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(@RequestParam(name="id",required=false,defaultValue="0") String name,Model model) {
        model.addAttribute("name",name);
        return "index";
    }
}
