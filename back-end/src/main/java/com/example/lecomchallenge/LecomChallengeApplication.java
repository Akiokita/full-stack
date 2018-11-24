package com.example.lecomchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LecomChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LecomChallengeApplication.class, args);
    }
}
