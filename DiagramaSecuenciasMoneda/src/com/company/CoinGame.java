package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class CoinGame {
    public Player player1 = new Player("Lalo");
    public Player player2 = new Player("Fabian");
    public Coin theCoin = new Coin();
    private String winningFlip;


    void startGame()
    {
        int opc = 1;
        while(opc != 0)
        {
            Random rand = new Random();
            int num = rand.nextInt(2);
            if (num == 0) {
                System.out.println("Empieza el jugador 1.");
                player1.setCoinOption(player1.getRandCoinOption());
                if (player1.getCoinOption() == "Face")
                    player2.setCoinOption("Tail");
                else
                    player2.setCoinOption("Face");
            } else {
                System.out.println("Empieza el jugador 2.");
                player2.setCoinOption(player2.getRandCoinOption());
                if (player2.getCoinOption() == "Face")
                    player1.setCoinOption("Tail");
                else
                    player1.setCoinOption("Face");
            }
            if (theCoin.getCoinOption() == "Face")
                winningFlip = "Face";
            else
                winningFlip = "Tail";

            player1.didPlayerWin(winningFlip);
            player2.didPlayerWin(winningFlip);
            System.out.println("1) Jugar de nuevo \n 0) Terminar");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            opc = i;
        }
    }

}
