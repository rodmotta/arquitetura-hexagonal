package com.github.rodmotta.hexagonalarchitecture.adapters.persistence;

import com.github.rodmotta.hexagonalarchitecture.application.domain.Greeting;
import com.github.rodmotta.hexagonalarchitecture.application.port.GreetingRepositoryPort;

import java.util.logging.Logger;

public class GreetingRepository implements GreetingRepositoryPort {

    private final Logger logger = Logger.getLogger("Greeting repository");

    @Override
    public Greeting getGreeting() {
        logger.info("Outbound adapter -> Database search");
        return new Greeting("How are you doing?");
    }
}
