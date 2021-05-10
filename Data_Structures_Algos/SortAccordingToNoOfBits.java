import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class SortAccordingToNoOfBits {
    private static Integer[] sortBySetBitCount(Integer[] arr, int n) {
        // TODO Auto-generated method stub
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1) {
                // TODO Auto-generated method stub
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                    return -1;
            }
        });
        return arr;
    }
    
    public static void main(String[] args) {
       // sortBySetBitCount(new Integer[]{}, 2);
       
    }
}
