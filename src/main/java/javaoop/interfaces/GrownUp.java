package javaoop.interfaces;

public class GrownUp implements HumanBeing, Paying{
    public void sayHi() {
        System.out.println("Buna ziua, adult");
    }

    public void pay(){
        System.out.println("I'm paying!");
    }
}
