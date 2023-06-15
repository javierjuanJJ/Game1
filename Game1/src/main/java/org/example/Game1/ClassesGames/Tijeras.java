package org.example.Game1.ClassesGames;

import org.example.Game1.Game;

public class Tijeras extends Game {

    @Override
    public boolean isWinner(Game player) {
        return player instanceof Papel || player instanceof Lagarto;
    }

    @Override
    public String toString() {
        return Tijeras.class.getName();
    }
}
