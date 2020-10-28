package compositionoverinheritance;

public class Rectangle {
    private int l;
    private int L;

    Rectangle(int l, int L){
        this.l = l;
         this.L = L;
    }

    int getArea(){
        return l * L;
    }

    void rectangleSpecific(){
        System.out.println("rectangleSpecific()");
    }
}
