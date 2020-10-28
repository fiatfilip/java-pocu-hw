package javaoop;

public class Person {
    private int age;
    private Integer weight;
    private String name;

    private boolean married = true;

    public Person(){
//        this.name = "John Doe";
//        this.weight = 80;
//        this.age = 50;
        this("", "John Doe", 80);
    }

    Person(String name, Integer weight, int age){
        // super()
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    Person(String salutation, String name, Integer weight){
        this(salutation + " " + name, weight, 18);
    }

    Person(Integer age, boolean married) throws Exception{
        this("name", "weight", age);
        this.married = married;
        if(age < 18 || age > 100) {
            throw new Exception("Invalid age");
        }

    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    private void privateMethod(){

    }

    void packageMethod(){

    }

    protected void protectedMethod(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", married=" + married +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());

        Person p1Bis = new Person();
        System.out.println(p1Bis.toString());

        Person p2 = new Person("Filip", 90, 40);
        System.out.println(p2.toString());

        Person p2Bis = new Person("William", 190, 80);
        System.out.println(p2Bis.toString());

        Person matei = new Person("Domnul", "Matei", 65);
        matei.setMarried(false);
        matei.privateMethod();
        matei.packageMethod();
        matei.protectedMethod();
        System.out.println(matei.toString());

        try {
            Person error = new Person(91, false);
            System.out.println(error);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Other{
    public static void main(String[] args) {
        Person person = new Person();
        // person.privateMethod();
        person.packageMethod();
        person.protectedMethod();
    }
}
