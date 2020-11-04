package unittesting;

public class Caller {
    public static String someMethodToBeInvoqued(String name){
        return name + " > " + Callee.methodToBeCalled();
    }
}
