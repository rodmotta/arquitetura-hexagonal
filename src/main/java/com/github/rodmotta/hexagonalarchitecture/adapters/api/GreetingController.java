package com.github.rodmotta.hexagonalarchitecture.adapters.api;

import com.github.rodmotta.hexagonalarchitecture.application.domain.Greeting;
import com.github.rodmotta.hexagonalarchitecture.application.port.GreetingServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class GreetingController {

    private final Logger logger = Logger.getLogger("Greeting controller");

    @Autowired
    private GreetingServicePort greetingServicePort;

    @GetMapping
    private ResponseEntity<Greeting> getGreeting() {
        logger.info("Inbound adapter -> Processing request");
        Greeting greeting = greetingServicePort.getGreeting();
        return ResponseEntity.ok(greeting);
    }
}
