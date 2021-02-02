import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Pool
 */
public class Pool {

    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new NewOneThread(cd1, "A"));
        es.execute(new NewOneThread(cd2, "B"));
        es.execute(new NewOneThread(cd3, "C"));
        es.execute(new NewOneThread(cd4, "D"));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (Exception e) {
            System.out.println(e);
        }

        es.shutdown();
        System.out.println("Exit Code(0)");
    }
}

class NewOneThread implements Runnable {

    CountDownLatch cd;
    String name;

    NewOneThread(CountDownLatch cd, String name) {
        this.cd = cd;
        this.name = name;
        new Thread(this);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " : " + i);
            cd.countDown();
        }
    }

}