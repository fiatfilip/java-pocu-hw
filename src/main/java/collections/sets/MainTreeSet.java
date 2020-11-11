package collections.sets;

import collections.AgeComparator;
import collections.Persoana;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Persoana> persons = new TreeSet<>();
        persons.add(new Persoana("Georgel", 25));
        persons.add(new Persoana("Alina", 22));

        for (Persoana persoana: persons) {
            System.out.println(persoana);
        }

        persons.add(new Persoana("Bianca", 42));

        System.out.println("--");
        for (Persoana persoana: persons) {
            System.out.println(persoana);
        }

        AgeComparator ageComparator = new AgeComparator();
        Set<Persoana> ageSortedPersons = new TreeSet<>(ageComparator);
        ageSortedPersons.addAll(persons);

        System.out.println("--");
        for (Persoana persoana: ageSortedPersons) {
            System.out.println(persoana);
        }
    }
}
