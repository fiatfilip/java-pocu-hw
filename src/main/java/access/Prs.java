package access;

import javaoop.Person;

public class Prs extends Person {
    public static void main(String[] args) {
        Prs p = new Prs();
        p.protectedMethod();
    }
}
