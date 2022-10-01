package com.bridgeLabz.oops;

class Parent {
    int a = 10 , b =20 , c=30 , d ;
    void add (){
        d=a+b ;
        System.out.println(d + "  :parent");
    }
}
class Child extends Parent {
//     super.add() ;
    void add () {
        d= a+b+c ;
        System.out.println(d + "  :Child");
    }
}

public class OverridingConcept {
    public static void main(String[] args) {
        Child obj = new Child() ;
        obj.add();
    }
}
