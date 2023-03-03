package com.udemy38h.learnspringframeworkmodernway;

import com.udemy38h.learnspringframeworkmodernway.game.GameRunner;
import com.udemy38h.learnspringframeworkmodernway.game.GamingConsole;
import com.udemy38h.learnspringframeworkmodernway.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.udemy38h.learnspringframeworkmodernway.game")
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
        }
    }
}
