package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameRunner {
    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            System.out.println(context.getBean("gameName"));
        }

    }
}
