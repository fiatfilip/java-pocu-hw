package collections.arrays;

import collections.Angajat;
import collections.Persoana;
import collections.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Persoana[] persoane = new Persoana[5];
        persoane[0] = new Student("Ilie");
        persoane[1] = new Angajat("Ion", 25);
        persoane[2] = new Student("Ileana", 16);
        persoane[3] = new Student("Ramona");
        persoane[4] = new Angajat("Pavel", 41);
        // persoane[5] = new Student("Marcel");

        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

        persoane[2] = new Student("Marcel", 37);
        System.out.println();
        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

        Arrays.sort(persoane);

        System.out.println("-sort nume");
        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

        Comparator<Persoana> ageComparator = new Comparator<Persoana>() {
            @Override
            public int compare(Persoana o1, Persoana o2) {
                return o1.getVarsta() - o2.getVarsta();
            }
        };

        Arrays.sort(persoane, ageComparator);

        System.out.println("-sort varsta");
        for (Persoana persoana: persoane) {
            System.out.println(persoana);
        }

        System.out.println(persoane.length);

    }
}
