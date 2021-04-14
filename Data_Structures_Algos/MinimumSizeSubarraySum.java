public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, min = Integer.MAX_VALUE;
        int sum = nums[0];

        while (start < nums.length || end < nums.length) {
            if (sum >= target) {
                if ((end - start + 1) < min) {
                    min = (end - start + 1);
                }
                sum -= nums[start];
                start += 1;
            } else {
                end += 1;
                if (end < nums.length) {
                    sum += nums[end];
                } else if (start < nums.length) {
                    sum -= nums[start];
                    start += 1;
                } else {
                    break;
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(11, nums));
    }
}
