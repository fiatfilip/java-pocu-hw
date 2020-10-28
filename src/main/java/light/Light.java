package light;

public class Light {
    private int luminosity;
    private int maxLuminosity;
    // private boolean broken;

    public Light(int maxLuminosity){
        this.maxLuminosity = maxLuminosity;
    }

    public void on(){
        luminosity = maxLuminosity;
    }

    public void off(){
        luminosity = 0;
    }

    public void brighten(){
        luminosity = Math.min(maxLuminosity, luminosity + 1);
    }

    public void dim(){
        luminosity = Math.max(0, luminosity - 1);
    }

    public void breakLight(){
        this.maxLuminosity = 0;
        this.luminosity = 0;
    }

    @Override
    public String toString() {
        return "Light{" +
                "luminosity=" + luminosity +
                ", maxLuminosity=" + maxLuminosity +
                '}';
    }
}
