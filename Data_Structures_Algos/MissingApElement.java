import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MissingApElement {

    public static int getMissingElement(int[] nums) {
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (!intMap.containsKey(nums[i + 1] - nums[i])) {
                if (intMap.containsKey((nums[i + 1] - nums[i]) * 2)) {
                    return nums[intMap.get((nums[i + 1] - nums[i]) * 2)] + (nums[i + 1] - nums[i]);
                } else if (intMap.containsKey((nums[i + 1] - nums[i]) / 2)) {
                    return nums[i] + ((nums[i + 1] - nums[i]) / 2);
                } else {
                    intMap.put(nums[i + 1] - nums[i], i);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //getMissingElement(new int[]{2, 10, 14});
        
    }
}
