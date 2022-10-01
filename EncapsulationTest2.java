package com.bridgeLabz.oops;

class Google {
    private String name ;
    private String DOB ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("Madhu")){
            this.name=" " ;
        }
        else {
            this.name = name;
        }


    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}

public class EncapsulationTest2 {
    public static void main(String[] args) {
        Google obj = new Google() ;
        obj.setName("Madhu Sudhan S");
        obj.setDOB("7/1/1998");
        System.out.println("Name of the User :" + obj.getName() +  "\n  DOB : " + obj.getDOB());
    }
}
