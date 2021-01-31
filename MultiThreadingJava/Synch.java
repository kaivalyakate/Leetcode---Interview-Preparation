public class Synch {

    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        Caller callerOne = new Caller(callMe, "Hello");
        Caller callerTwo = new Caller(callMe, "World");
        Caller callerThree = new Caller(callMe, "one");

        try {
            callerOne.t.join();
            callerTwo.t.join();
            callerThree.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class CallMe {

    synchronized void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    CallMe target;
    String msg;
    Thread t;

    Caller(CallMe targ, String msg) {
        this.target = targ;
        this.msg = msg;
        t = new Thread(this, "msg");
        t.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        this.target.call(this.msg);
    }

}
