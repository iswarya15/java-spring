package com.in28minutes.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//        Launch a Spring context

            var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

//        Configure the things that we want Spring to manage - @Configuration

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("yourCustomNameAddress"));

            System.out.println(context.getBean("person2MethodCall"));

            System.out.println(context.getBean("person3Parameters"));
//        SpringApplication.run(LearnSpringFrameworkApplication.class, args);

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
