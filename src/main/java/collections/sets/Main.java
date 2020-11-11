package collections.sets;

import collections.Angajat;
import collections.Persoana;
import collections.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Persoana> persoane = new HashSet<>();
        Student ilie1= new Student("Ilie");
        Student ilie2 = new Student("Ilie");
        persoane.add(ilie1);
        persoane.add(ilie2);
        System.out.println(ilie1.equals(ilie2));
        persoane.add(new Persoana("Ilie", 22));
        persoane.add(new Angajat("Ion", 25));
        persoane.add(new Student("Ileana", 16));
        persoane.add(new Student("Ramona"));
        persoane.add(new Angajat("Pavel", 41));
        persoane.add(new Student("Marcel")); // .....

        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

    }
}
