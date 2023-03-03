package com.udemy38h.learnspringframeworkmodernway.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //    private MarioGame game;

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Runing game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
