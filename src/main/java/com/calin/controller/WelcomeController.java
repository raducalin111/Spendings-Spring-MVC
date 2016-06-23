package com.calin.controller;

import com.calin.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Calin on 6/1/2016.
 */
@Controller
public class WelcomeController {

    @Autowired
    UserServiceImpl userService;

    private static final String WELCOME_VARIABLE = "welcome";

    @RequestMapping
    public String home(Model model) {
        String welcomeMessage = "Welcome!";
        String view = "welcome";

        model.addAttribute(WELCOME_VARIABLE, welcomeMessage);

        return view;
    }

    @RequestMapping("/user/{id}")
    public String userById(Model model, @PathVariable("id") Integer id) {
        String view = "welcome";
        model.addAttribute(WELCOME_VARIABLE, userService.getUserById(id).getFirstName());
        return view;
    }
}
