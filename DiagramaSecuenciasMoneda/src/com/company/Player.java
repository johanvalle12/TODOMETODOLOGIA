package com.company;

import java.util.Random;

public class Player {
    private String Name;
    private String coinOption;

    public Player(String name)
    {
        this.Name = name;
    }

    public String getCoinOption()
    {
        return coinOption;
    }

    public void setCoinOption(String opponentFlip)
    {
        this.coinOption = opponentFlip;
    }

    public String getRandCoinOption()
    {
        Random random = new Random();
        int num = random.nextInt(2);
        if(num == 0)
            return "Face";
        else
            return "Tail";
    }
    public void didPlayerWin(String winningFlip)
    {
        if(winningFlip == coinOption)
            System.out.println("El jugador " + Name + " gano la partida.");
    }
}
