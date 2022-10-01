package com.bridgeLabz.oops;

abstract class Apple {
    abstract void display () ;
    void input (){
        System.out.println("Apple Mango");
    }
}
class Mango extends Apple {
    void display() {
        System.out.println("Abstract Apple");
    }

}


public class AbstractConcept {
    public static void main(String[] args) {
        Mango obj = new Mango() ;
        obj.display();
        obj.input();
    }
}
