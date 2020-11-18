package exceptions;

public class ThrowException extends Exception{

    public static void main(String[] args) {
        try {

            throw new ThrowException();

        } catch (ThrowException throwException){
            System.out.println("Tratare exceptie particulara");
        } catch (Exception exception){
            System.out.println("Tratare exceptie generica");
        } finally {
            System.out.println("Finally block");
        }
    }
}
