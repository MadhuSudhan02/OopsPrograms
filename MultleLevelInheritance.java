package com.bridgeLabz.oops;


class Addition {
    int a =10 , b=20 , c ;
    void add ()
    {
        c = a+b ;
        System.out.println( " Addition of a and b " + c);
    }
}
class Subtraction extends Addition {
    int a =30 , b=20 , c ;
    void sub ()
    {
        c = a-b ;
        System.out.println( " Addition of a and b " + c);
    }

}
class MulDiv extends Subtraction {
    int d = 30 , e = 2 , div , mul ;
    void muldiv ()
    {
        mul = d * e ;
        div = d/e ;
        System.out.println("the Multiplication is " + mul);
        System.out.println("the Division is " + div);
    }
}

public class MultleLevelInheritance {
    public static void main(String[] args) {
        MulDiv obj = new MulDiv() ;
        obj.add();
        obj.sub();
        obj.muldiv();
    }
}
