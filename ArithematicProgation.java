package com.bridgeLabz.oops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class ArithOne {
    int sum =0 ;
    void operation(int n){
        for(int i=1, a=1;i<=n;i++,a++ )
        {
            sum =sum + i ;
        }
    }
    void display(){
        System.out.println("the sum is : " + sum );
    }
}
class ArithTwo extends ArithOne{
    void operation(int n){
        super.operation(n);
        for(int i=1, a=9;i<=n;i++,a+=4 )
        {
            sum =sum + i ;
        }
    }
    void display(){
        System.out.println("the sum is : " + sum );
    }
}

public class ArithematicProgation {
    public static void main(String[] args) {
        ArithTwo obj1 = new ArithTwo() ;
        Scanner obj = new Scanner(System.in) ;
        System.out.println("Enter the number N ");
        int n = obj.nextInt();
        obj1.operation(n);
        obj1.display();
    }
}
