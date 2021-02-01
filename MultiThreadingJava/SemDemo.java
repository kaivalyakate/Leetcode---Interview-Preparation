import java.util.concurrent.Semaphore;

public class SemDemo {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

class Shared {
    static int count = 0;
}

class IncThread implements Runnable {

    Thread t;
    String name;
    Semaphore sem;

    IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Acquiring Permit...");
            sem.acquire();
            System.out.println("Permit Acquired");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Releasing Permit....");
        System.out.println(Shared.count);
        sem.release();
    }

}

class DecThread implements Runnable {

    Thread t;
    String name;
    Semaphore sem;

    DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Acquiring Permit...");
            sem.acquire();
            System.out.println("Permit Acquired");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Releasing Permit....");
        System.out.println(Shared.count);
        sem.release();
    }

}
