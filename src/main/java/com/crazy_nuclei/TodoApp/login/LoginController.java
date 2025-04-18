package com.crazy_nuclei.TodoApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(  @RequestParam(name = "username") String name,
                          @RequestParam(name = "password") String password,
                          Model model) {

        model.addAttribute("name", name);

        if (authenticationService.authenticate(name, password)) return "sayHello";

        model.addAttribute("errorMessage", "Invalid credentials, please try again !");
        return "login";
    }
}
