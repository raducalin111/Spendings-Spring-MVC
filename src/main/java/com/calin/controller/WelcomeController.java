package com.calin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Calin on 6/1/2016.
 */
@Controller
public class WelcomeController {

    private static final String WELCOME_VARIABLE = "welcome";

    @RequestMapping
    public String home(Model model) {
        String welcomeMessage = "Welcome!";
        String view = "welcome";

        model.addAttribute(WELCOME_VARIABLE, welcomeMessage);

        return view;
    }
}
