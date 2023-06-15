package org.example.Game1.ClassesGames;

import org.example.Game1.Game;

public class Piedra extends Game {

    @Override
    public boolean isWinner(Game player) {
        return player instanceof Lagarto || player instanceof Tijeras;
    }

    @Override
    public String toString() {
        return Piedra.class.getName();
    }
}
