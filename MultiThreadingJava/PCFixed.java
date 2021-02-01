public class PCFixed {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

class Q {
    public int n;
    public boolean valueSet;

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.n = n;
        this.valueSet = true;
        System.out.println("Put:" + n);
        notify();
    }

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.valueSet = false;
        System.out.println("Get:" + n);
        notify();
        return n;
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        this.t = new Thread(this, "Producer");
        this.t.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }

}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
        ;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            q.get();
        }
    }

}
