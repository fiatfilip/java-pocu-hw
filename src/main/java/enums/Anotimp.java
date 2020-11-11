package enums;

public enum Anotimp {
    Primavara, Vara, Toamna, Iarna;

    public static void main(String[] args) {
        for(Anotimp anotimp: Anotimp.values()){
            System.out.println(anotimp.name());
        }
    }
}
