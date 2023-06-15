package org.example;

import org.example.Game1.Game;

public class Main {

    private static final int NUMBER_PUNTUATION_WINNER = 3;

    public static void main(String[] args) {

        int puntuation1 = 0;
        int puntuation2 = 0;

        while (puntuation1 < NUMBER_PUNTUATION_WINNER && puntuation2 < NUMBER_PUNTUATION_WINNER) {
            Game player1 = Game.getOptionRandom();
            Game player2 = Game.getOptionRandom();

            if (!player1.getClass().getName().equals(player2.getClass().getName())) {

                if (player1.isWinner(player2)) {
                    puntuation1++;
                } else {
                    puntuation2++;
                }

                System.out.println(player1 + " " + player2);
                System.out.println(puntuation1 + " " + puntuation2);
            }

        }
    }
}