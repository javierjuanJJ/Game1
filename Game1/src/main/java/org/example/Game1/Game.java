package org.example.Game1;

import org.example.Game1.ClassesGames.*;

public abstract class Game {

    private static final Game[] OPTIONS = {
            new Tijeras(),
            new Papel(),
            new Piedra(),
            new Lagarto(),
            new Spoke(),
    };


    public static Game getOptionRandom() {
        int randomIndex = getRandomIndex(0, OPTIONS.length);
        return OPTIONS[randomIndex];
    }

    private static int getRandomIndex(int i, int length) {
        return (int) (Math.random()*length + i);
    }

    public Game(){

    }
    public abstract boolean isWinner(Game player);
}
