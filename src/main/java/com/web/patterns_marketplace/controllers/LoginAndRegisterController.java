package com.web.patterns_marketplace.controllers;

import com.web.patterns_marketplace.models.UserRegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginAndRegisterController {

    @GetMapping("/register")
    public String showRegistrationPage(Model model) {
        model.addAttribute("userDto", new UserRegisterDto());

        return "register";
    }
}
