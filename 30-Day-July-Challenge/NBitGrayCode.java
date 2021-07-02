import java.util.*;

public class NBitGrayCode {

    static int nextNum = 0;

    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        grayCodeHelper(result, n);
        return result;
    }

    private static void grayCodeHelper(List<Integer> result, int n) {
        if (n == 0) {
            result.add(nextNum);
            return;
        }
        grayCodeHelper(result, n - 1);
        // Flip the bit at (n - 1)th position from right
        nextNum = nextNum ^ (1 << (n - 1));
        grayCodeHelper(result, n - 1);

    }
    
    public static void main(String[] args) {
        List<Integer> ans = grayCode(2);
        for(Integer x: ans){
            System.out.println(x);
        }
    }
}
