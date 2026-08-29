package com.in28minutes.learn_spring_framework.game;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public String gameName() {
        return "Uno";
    }
}
