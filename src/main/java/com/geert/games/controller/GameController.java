package com.geert.games.controller;

import com.geert.games.Game;
import com.geert.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aryastark on 16/09/16.
 */

@Controller
public class GameController {

    @Autowired
    GameRepository gr;

    @RequestMapping("direct")
    @ResponseBody
    String directExample() {
        return "test";
    }

    @RequestMapping("/bar")
    String anyMethodName() {
        return "foo";
    }

    @RequestMapping("/gameList")
    public String ex(Model model) {
        model.addAttribute("gameList", gr.findAll());
        return "games";
    }

    @RequestMapping("/addgame")
    public String addGame() {
        return "addGame";
    }

    @RequestMapping(value = "/processgame", method = RequestMethod.POST)
    public String processForm(Game game, BindingResult br) {
        if (br.hasErrors()) {
            return "addGame";
        } else {
            gr.save(game);
        }
        return "redirect:/gameList";

    }
}
