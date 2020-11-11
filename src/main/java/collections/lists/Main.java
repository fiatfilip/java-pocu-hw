package collections.lists;

import collections.Angajat;
import collections.Persoana;
import collections.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persoana> persoane = new LinkedList<>();
        persoane.add(new Student("Ilie"));
        persoane.add(new Angajat("Ion", 25));
        persoane.add(new Student("Ileana", 16));
        persoane.add(new Student("Ramona"));
        persoane.add(new Angajat("Pavel", 41));
        persoane.add(new Student("Marcel")); // .....

        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

        Collections.sort(persoane);

        System.out.println("sortat");
        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

        Comparator<Persoana> ageComparator = new Comparator<Persoana>() {
            @Override
            public int compare(Persoana o1, Persoana o2) {
                return o1.getVarsta() - o2.getVarsta();
            }
        };

        Collections.sort(persoane, ageComparator);

        System.out.println("-sort varsta");
        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }
    }
}
