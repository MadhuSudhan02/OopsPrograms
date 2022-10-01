package com.bridgeLabz.oops;

 class student {
    String Student_name = "Madhu Sudhan S " ;
    int Roll_number = 21 , Marks_obtained =80 ;
    void display ()
    {
        System.out.println( Student_name + " Roll_number " + Roll_number + " Marks_obtained " + Marks_obtained );
    }
}
class Academy extends student {
    String School_name = " Modern School " ;
    void disc ()
    {
        System.out.println( School_name + " is doing well in academic");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Academy obj = new Academy() ;
        obj .display();
        obj .disc();
    }
}
