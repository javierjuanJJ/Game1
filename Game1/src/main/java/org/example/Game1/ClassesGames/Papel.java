package org.example.Game1.ClassesGames;

import org.example.Game1.Game;

public class Papel extends Game {

    @Override
    public boolean isWinner(Game player) {
        return player instanceof Piedra || player instanceof Spoke;
    }

    @Override
    public String toString() {
        return Papel.class.getName();
    }
}
