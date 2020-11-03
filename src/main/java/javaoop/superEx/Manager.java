package javaoop.superEx;

public class Manager extends Director {

    Manager(){
        // super(2000);
        System.out.println("Manager default cosntructor");
    }
    @Override
    public int getPayment() {
        System.out.println("get payment in Manager");

        return super.getPayment() - 100;
    }
}
