package com.sv.servintegra.app.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Moi
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String home(Model model) {
        return "/index";
    }
}
