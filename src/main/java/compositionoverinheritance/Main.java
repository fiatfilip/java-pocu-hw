package compositionoverinheritance;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        System.out.println(r1.getArea());


        // Square1 s1 = new Square1(2);
        Rectangle s1 = new Square1(2);
        System.out.println(s1.getArea());
        s1.rectangleSpecific();

        Square2 s2 = new Square2(4);
        System.out.println(s2.getArea());
    }
}
