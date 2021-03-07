import java.util.Arrays;

public class SetDiff {

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[] {};
        Arrays.sort(nums);
        int j = 1;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                k = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != j) {
                break;
            }
            j += 1;
        }
        if (k > 0) {
            ans = new int[2];
            ans[0] = k;
            ans[1] = j;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 5, 3, 2, 2, 7, 6, 4, 8, 9 };
        int[] ans = findErrorNums(nums);
        for (int x : ans) {
            System.out.println(x);
        }
    }
}