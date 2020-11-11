package generics;


public class MyList<T> {
    private Object[] elements = new Object[10];
    private int index = 0;
    void add(T element){
        elements[index] = element;
        index++;
    }
    T get(int index){
        return (T)elements[index];
    }

    public static void main(String[] args) {
        MyList<Book> books = new MyList<>();
        books.add(new Book("Bird cage"));
        System.out.println(books.get(0).getTitle());
    }
}
