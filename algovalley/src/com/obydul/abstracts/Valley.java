package com.obydul.abstracts;

abstract class Java {

    void mini() {
        System.out.println("Mini");
    }

    abstract void doll();
}

class Algo extends Java {

    void doll() {
        System.out.println("Doll");
    }
}

public class Valley {

    public static void main(String[] args) {
        Algo obj1 = new Algo();
        obj1.doll();
        obj1.mini();
    }
}
