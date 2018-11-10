
package com.obydul.statics;

class Java{
    static void mini(int a){
        System.out.print("Java");
    }
}

class Algo
{
    static void mini(String s){
        System.out.print("Algo");
    }
}
public class Valley {
    public static void main(String[] args) {
        Java obj1 = new Java();
        Algo obj2 = new Algo();
        obj1.mini(1);
        obj2.mini("Doll");
    }
}
