public class HelloWorld {
    static int var1;
    double var2;
    public static void main(String[] args) {

        for(int i = 0; i < args.length; i=i+2){
            System.out.println(args[i]);
        }
        // <=>
        for(String arg: args){
            System.out.println(arg);
        }


        System.out.println("Hello");
        int len= 7;
        String nr = "22";
        System.out.println(2 + Double.parseDouble(nr));
        System.out.println(2 + nr);
        // int len = args.length;
        System.out.println(len);
        int a=0, i=1, b=0;
        while(a<4){
            if(i==a){
                b=i++;
//                b=i;
//                i = i+1;
//
//
//                i=i+1;
//                b=1;
            }else{
                ++i;
            }
            a=a+2;
        }
        System.out.println(b);

    }
}
