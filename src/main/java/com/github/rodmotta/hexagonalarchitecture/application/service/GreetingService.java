package com.github.rodmotta.hexagonalarchitecture.application.service;

import com.github.rodmotta.hexagonalarchitecture.application.domain.Greeting;
import com.github.rodmotta.hexagonalarchitecture.application.port.GreetingRepositoryPort;
import com.github.rodmotta.hexagonalarchitecture.application.port.GreetingServicePort;

import java.util.logging.Logger;

public class GreetingService implements GreetingServicePort {

    private final Logger logger = Logger.getLogger("Greeting service");

    private final GreetingRepositoryPort greetingRepositoryPort;

    public GreetingService(GreetingRepositoryPort greetingRepositoryPort) {
        this.greetingRepositoryPort = greetingRepositoryPort;
    }

    @Override
    public Greeting getGreeting() {
        logger.info("Use case -> Business logic");
        return greetingRepositoryPort.getGreeting();
    }
}
