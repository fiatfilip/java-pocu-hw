package light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light(100);
        // light.luminosity = 10000000;
        light.dim();
        System.out.println(light);
        light.brighten();
        light.breakLight();
        System.out.println(light);
    }
}
