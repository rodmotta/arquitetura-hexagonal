package com.github.rodmotta.hexagonalarchitecture;

import com.github.rodmotta.hexagonalarchitecture.application.service.GreetingService;
import com.github.rodmotta.hexagonalarchitecture.adapters.persistence.GreetingRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HexagonalArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalArchitectureApplication.class, args);
    }

    @Bean
    public GreetingRepository repository() {
        return new GreetingRepository();
    }

    @Bean
    public GreetingService service(GreetingRepository greetingRepository) {
        return new GreetingService(greetingRepository);
    }
}
