public class DigitCount {
    public static void main(String[] args) {
        new NewThread();
        new NewThread();
    }
}

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "MyNewThread");
        t.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            for (int i = 5; i > -1; i--) {
                System.out.println(i);
                Thread.sleep(1500);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}