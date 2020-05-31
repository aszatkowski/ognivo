package pl.bp.ognivo.rest.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String login, @RequestParam String password) {
        return "Login is: " + login + ", password is: " + password;
    }

}
