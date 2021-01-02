package java8;

public class Gift {
    String content;
    public Gift(){
        content = "coal";
    }

    public Gift(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "content='" + content + '\'' +
                '}';
    }
}
