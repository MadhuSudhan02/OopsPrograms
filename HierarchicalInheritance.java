package com.bridgeLabz.oops;
class Abc{
    void input()
    {
        System.out.println("working for the same company ");
    }
}

class Def extends Abc{
    static void display()
    {
        System.out.println("Ram ");
    }
}
class Ghi extends Abc {
    void show ()
    {
        System.out.println("Sita");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Def obj = new Def() ;
        Ghi obj2 = new Ghi();
        obj.display () ;
        obj2.show();
        obj.input();

    }
}

