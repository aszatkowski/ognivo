package pl.bp.ognivo.rest.service;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class LoginController {

    @PostMapping("/authenticate")
    public String authenticate(HttpServletResponse response, @RequestParam String login, 
    @RequestParam String password) {
        String token = produceToken(login);
        response.addHeader("token", token);
        return "Login is: " + login + ", password is: " + password;
    }

    //TODO: wynieść jako generyczne
    private String produceToken(String login){
        Long now = System.currentTimeMillis();
        return Jwts.builder()
                .setSubject(login)
                .claim("roles", "user")
                .setIssuedAt(new Date(now))
                .setExpiration(new Date(now + 10000)) //TODO: wynieść do parametrów
                .signWith(SignatureAlgorithm.HS512, "secretkey").compact(); //TODO: klucz wygenerować i do parametrów

    }
}
