package com.github.rodmotta.hexagonalarchitecture.application.domain;

public class Greeting {
    private final String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
