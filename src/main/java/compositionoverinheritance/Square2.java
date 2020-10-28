package compositionoverinheritance;

public class Square2 {
    private Rectangle rectangle;

    Square2(int edge){
        this.rectangle = new Rectangle(edge, edge);
    }

    public int getArea(){
        return rectangle.getArea();
    }
}
