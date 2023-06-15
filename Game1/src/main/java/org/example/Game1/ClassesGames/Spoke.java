package org.example.Game1.ClassesGames;

import org.example.Game1.Game;

public class Spoke extends Game {

    @Override
    public boolean isWinner(Game player) {
        return player instanceof Tijeras || player instanceof Piedra;
    }

    @Override
    public String toString() {
        return Spoke.class.getName();
    }
}
