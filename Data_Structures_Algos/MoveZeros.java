import java.util.Arrays;
import java.util.LinkedList;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[j] = nums[i];
                j++;
            } else {
                count += 1;
            }
        }
        for (int i = j; i < count + j; i++) {
            ans[i] = 0;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        moveZeroes(new int[] { 0, 1, 0, 3, 1, 2, 0, 0 });
    }
}
