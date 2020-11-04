package javaoop.annonymous;

public class Main {
    public static void main(String[] args) {
        MyInterface obj1 = new MyImplementation();

        MyInterface obj2 = new MyInterface() {
            public void method() {
                System.out.println("Annonymous type");
            }
        };

        MyInterface obj3 = new MyImplementation(){
            @Override
            public void method() {
                System.out.println("something changed");
            }
        };

        obj3.method();


        obj1.method();
        obj2.method();
    }
}
