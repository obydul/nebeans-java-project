package com.obydul.random;

import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        Random rand = new Random();
        int ranNum;
        ranNum = rand.nextInt(5) + 1;
        System.out.println("Random = " + ranNum);

        int randomNum = (int) (Math.random() * 10) + 1;
        System.out.println("Math.random = " + randomNum);

    }

}
