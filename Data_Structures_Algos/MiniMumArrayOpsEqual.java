public class MiniMumArrayOpsEqual {

    public static int minOperations(int n) {
        int ops = 0, i = 1, count = 0;
        while (i < (Math.pow(n, 2) / n)) {
            ops += ((Math.pow(n, 2) / n) - i);
            i += 2;
            count++;
        }
        return ops;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(6));
    }
}
