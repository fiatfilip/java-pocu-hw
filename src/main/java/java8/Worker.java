package java8;

public class Worker implements WorkerInterface {
    @Override
    public String doWork() {
        return "Regular worker";
    }
}
