public class RemoveDupsFromSorted {
    
    public static int[] remove(int[] nums, int index, int limit, int n) {
        while(limit<n){
            nums[index] = nums[limit];
            index++;
            limit++;
        }
        return nums;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2, fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}
