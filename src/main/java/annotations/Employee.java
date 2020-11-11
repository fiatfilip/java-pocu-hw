package annotations;

public class Employee extends Person{
    private String name;

    Employee(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return "Employee "  + name;
    }

    public static void main(String[] args) {
        Employee mark = new Employee("Mark Williams");
        System.out.println(mark.getName());

        Employee eleonor = new Employee("Eleonor Russel");
        System.out.println(eleonor.getName());
    }
}
