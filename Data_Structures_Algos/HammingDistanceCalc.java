public class HammingDistanceCalc {

    public int hammingDistance(int x, int y) {
        int q1 = 0, q2 = 0;
        int distance = 0;
        while (x > 0 || y > 0) {
            q1 = x % 2;
            q2 = y % 2;
            if (q1 != q2) {
                distance++;
            }
            x = x/2;
            y = y/2;
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistanceCalc().hammingDistance(1, 4));
    }
}
