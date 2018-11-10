
package com.obydul.generics;

public class Generics <T> {
    private T obj;
    

    public Generics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    
    public void showType(){
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}
