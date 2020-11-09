package enums;

public enum Gender {
    MASCULIN("Dl."), FEMININ("Dna."), ND("");

    private String salutation;

    Gender(String salutation){
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }

    public static void main(String[] args) {
        System.out.println(Gender.FEMININ.getSalutation());
    }
}
