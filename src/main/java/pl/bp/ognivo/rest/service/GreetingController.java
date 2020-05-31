package pl.bp.ognivo.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting()
    {
        return "Greeting From Artur's Mac Mini! Yeah!";
        
    }
}
