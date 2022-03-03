package com.github.rodmotta.hexagonalarchitecture.application.port;

import com.github.rodmotta.hexagonalarchitecture.application.domain.Greeting;

public interface GreetingServicePort {
    Greeting getGreeting();
}
