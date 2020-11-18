package exceptions.tcf;

import org.apache.maven.surefire.api.event.StandardStreamOutEvent;

import java.util.Random;

public class TryCatchFinaly {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int nr = randomizer.nextInt(3);
        System.out.println(nr);
        try {
            System.out.println("Before exceptions");
            if (0 == nr) throw new Exception1("Exception 1");

            System.out.println("Before Exception 2");
            if (1 == nr) throw new Exception2("Exception 2");

            System.out.println("After exceptions");
        } catch (Exception1 ex1){
            System.out.println("1: " + ex1);
        } catch (Exception2 ex2){
            System.out.println("2: " + ex2);
        } finally{
            System.out.println("Fianlly block");
        }

    }
}

class Exception1 extends Exception{
    public Exception1(String message){
        super(message);
    }
}

class Exception2 extends Exception{
    public Exception2(String message){
        super(message);
    }
}
