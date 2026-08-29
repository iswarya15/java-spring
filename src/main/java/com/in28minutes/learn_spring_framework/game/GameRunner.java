package game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameRunner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        System.out.println(context.getBean("gameName"));

    }
}
