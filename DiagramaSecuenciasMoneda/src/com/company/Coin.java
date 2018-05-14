package com.company;

import java.util.Random;

public class Coin {
    String coinOption;

    public Coin()
    {
        Random random = new Random();
        int num = random.nextInt(2);
        if(num == 0)
            coinOption = "Face";
        else
            coinOption = "Tail";
    }
    public String getCoinOption()
    {
        return coinOption;
    }
}
