package javaoop.interfaces;

public class Child implements HumanBeing, Playing{
    public void sayHi() {
        System.out.println("Salutare copil!");
    }

    public void play() {
        System.out.println("I'm playing");
    }
}
