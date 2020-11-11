package generics;

public class Box<T> {
    private T obj;

    // private static T label;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Box<Book> myBox = new Box<>();
        Book myBook = new Book("Bird box");
        myBox.setObj(myBook);
        // myBox.setObj(Double.valueOf(2.0));

        myBook = myBox.getObj();
        System.out.println(myBook.getTitle());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setObj(Double.valueOf(2.0));
        System.out.println(doubleBox.getObj());

        Box<Integer> integerBox = new Box<Integer>();
    }
}
