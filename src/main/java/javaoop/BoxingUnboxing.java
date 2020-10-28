package javaoop;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int i = 0;
        // Integer j = i;
        Integer j = Integer.valueOf(i);
        j.toString();
        j.getClass();

        // int k = j;
        int k = j.intValue();

        Person p = new Person();
        p.packageMethod();
    }
}
