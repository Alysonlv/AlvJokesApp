package com.alv.jokes.app.alvjokesapp.controllers;

import com.alv.jokes.app.alvjokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alyson Vasconcelos - 13/02/2018
 */

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
