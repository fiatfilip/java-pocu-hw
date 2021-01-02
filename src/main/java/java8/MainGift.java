package java8;

public class MainGift {
    public static void main(String[] args) {
//        GiftFactory santasFactory = new GiftFactory() {
//            @Override
//            public Gift createGift(String content) {
//                return new Gift(content);
//            }
//        };

//        GiftFactory santasFactory = content -> {return new Gift(content)} ;

        GiftFactory santasFactory = Gift::new;
        System.out.println(santasFactory.createGift("Bomboane"));

        NaughtyGiftFactory filipsFactory = Gift::new;
        System.out.println(filipsFactory.createGift());
    }

}
