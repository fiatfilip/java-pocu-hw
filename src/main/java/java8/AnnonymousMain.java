package java8;

public class AnnonymousMain {
    public static void main(String[] args) {
        WorkerInterface worker1 = new Worker();
        System.out.println(worker1.doWork());

        WorkerInterface worker2 = new WorkerInterface() {
            @Override
            public String doWork() {
                return "Special worker";
            }
        };
        System.out.println(worker2.doWork());
    }
}
