package staticDynamic;

public class Main {
    public static void main(String[] args) {
        Entity.value =10;
        Entity e1 = new Entity();
        e1.value = 100;
        e1.val = 10;
        System.out.println(e1.value);
        System.out.println(e1.val);
        Entity e2 = new Entity();
        System.out.println(e2.value);
        System.out.println(e2.val);

        Entity e = new Entity();
        System.out.println(e.toString());


        int a = 2;
        int b = 3 * a;
        b = dublu(a);
        int c = 3 * b;
        c = dublu(b);
        dublu(7);
        nothing();
    }


    private static int dublu(int parametru){
        System.out.println(parametru);
        return 32 * parametru;
    }

    private static void nothing(){
        System.out.println("nothing");
    }
}
