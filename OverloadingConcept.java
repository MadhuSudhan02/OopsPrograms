package com.bridgeLabz.oops;

class Test {
    int a=10 , b=20 , c ;

    void add (){
        System.out.println(a+b);
    }

    void add (int a , int b){
        c = a+b ;
        System.out.println(c);
    }
    void add (int a, int b ,int c){
        c= a+b+c ;
        System.out.println(c);
    }

}

public class OverloadingConcept {
    public static void main(String[] args) {
        Test obj = new Test() ;
        obj.add();
        obj.add(5,1);
        obj.add(5,6,7);
    }
}
