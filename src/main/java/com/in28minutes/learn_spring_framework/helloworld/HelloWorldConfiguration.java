package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, String age, Address address){ }
record Address(String firstLine, String city){ }

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Iswarya";
    }

    @Bean
    public String age(){ return "27";}

    @Bean
    public Person person() {
        return new Person("Jessica Pearson", "35", new Address("Main Street", "Germany"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    // Spring inspects method parameters to automatically find by bean name and inject matching beans.
    @Bean
    public Person person3Parameters(String name, String age, Address yourCustomNameAddress) {
        return new Person(name, age, yourCustomNameAddress);
    }

    @Bean(name="yourCustomNameAddress")
    public Address address() {
        return new Address("Downing Street", "London");
    }

}
