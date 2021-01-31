public class MultiTreading {

    public static void main(String[] args) {
        NewOThread ob1 = new NewOThread("1");
        NewOThread ob2 = new NewOThread("2");
        System.out.println(ob1.getName() + " is Alive:" + ob1.t.isAlive());
        System.out.println(ob2.getName() + " is Alive:" + ob2.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(ob1.getName() + " is Alive:" + ob1.t.isAlive());
        System.out.println(ob2.getName() + " is Alive:" + ob2.t.isAlive());

    }
}

class NewOThread extends Thread {
    Thread t;

    NewOThread(String name) {
        t = new Thread(this, name);
        System.out.println("Starting Thread " + t.getName() + "......");
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > -1; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}