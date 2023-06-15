package org.example.Game1.ClassesGames;

import org.example.Game1.Game;

public class Lagarto extends Game {

    @Override
    public boolean isWinner(Game player) {
        return player instanceof Spoke || player instanceof Papel;
    }

    @Override
    public String toString() {
        return Lagarto.class.getName();
    }
}
