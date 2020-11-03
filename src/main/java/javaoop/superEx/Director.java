package javaoop.superEx;

public class Director {

    private int salary;

    Director(){
        System.out.println("Director default constructor");
        salary = 1000;
    }

    Director(int salary){
        System.out.println("Director custom constructor");
        this.salary = salary;
    }

    public int getPayment(){
        System.out.println("get Payment in Director");
        return 1000;
    }
}
