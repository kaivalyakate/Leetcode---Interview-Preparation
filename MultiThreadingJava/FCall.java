import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FCall {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f1;
        Future<Integer> f2;
        Callable<Integer> c1 = new Sum(10);

        f1 = es.submit(c1);
        f2 = es.submit(new Sum(20));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
        } catch (Exception e) {
            System.out.println(e);
        }

        es.shutdown();
    }
}

class Sum implements Callable<Integer> {
    int n;
    int sum = 0;

    Sum(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        // TODO Auto-generated method stub
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

}

/**
 * Hypotenuse implements Runnable
 */
class Hypotenuse implements Callable<Double> {
    Double A, B;

    Hypotenuse(Double A, Double B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public Double call() throws Exception {
        // TODO Auto-generated method stub
        return Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
    }

}
