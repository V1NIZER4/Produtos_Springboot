package com.example.produtos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellow {
    @RequestMapping("/DT")
    public String hello(Model model) {

        String msg= "Rei da Tarifa";
        model.addAttribute("mes",msg);
        return "hellow";
    }

}
