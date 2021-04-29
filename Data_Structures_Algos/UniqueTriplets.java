import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UniqueTriplets {

    public static List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            if (k == 0 || (k > 0 && nums[k] != nums[k - 1])) {
                int i = k + 1, j = nums.length - 1;
                int target = 0 - nums[k];
                while (i < j) {
                    if (target == (nums[i] + nums[j])) {
                        result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                        while (i < j && nums[i] == nums[i + 1])
                            i++;
                        while (i < j && nums[j] == nums[j - 1])
                            j--;
                        i++;
                        j--;
                    } else if (target < (nums[i] + nums[j])) {
                        j--;
                    } else {
                        i++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new Integer[] { -1, 0, 1, 2, -1, -4 });
        for (List<Integer> x : result) {
            System.out.println(x.toString());
        }
    }
}
