package javaoop.interfaces;

public class Oldman implements HumanBeing, Paying{
    public void sayHi() {
        System.out.println("E he he, pe vremea mea!");
    }

    public void pay() {
        System.out.println("Paying some ice cream for grand children");
    }
}
