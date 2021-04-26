import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int[] ans = new int[2];
        Arrays.sort(numbers);
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                ans[0] = i;
                ans[1] = j;
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }
}
