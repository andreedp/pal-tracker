package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String greetings;

    public WelcomeController(
            @Value("${WELCOME_MESSAGE:NOT SET}") String greetings
    ) {
        this.greetings = greetings;
    }

    @GetMapping("/")
    public String sayHello() {
        return greetings;
    }
}
