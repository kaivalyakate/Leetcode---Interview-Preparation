import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NonOverlappingSubArray {

    public static int GetMaxArrays(int arr[], int K) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0, end = 0, s = 0;
        int max1 = 0, max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
                if(end>start && (end - start + 1)==K){
                    max1 = max_so_far;
                    break;
                }
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is " + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return max_so_far;
    }

    public static void main(String[] args) {
        System.out.println(GetMaxArrays(new int[] { 3, 6, 1, 1, 6 }, 2));
    }
}
