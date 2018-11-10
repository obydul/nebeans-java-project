package com.obydul.thread;

class Algo extends Thread {

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.print("Doll");
        }
    }
}

public class Valley {
    public static void main(String[] args) {
        Algo t = new Algo();
        t.start();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Mini");
        }
        System.out.println("");
    }
}
