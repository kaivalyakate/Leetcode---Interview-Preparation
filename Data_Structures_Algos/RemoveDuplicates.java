public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            nums[i] = nums[j];
            if(j+1<nums.length && nums[j]==nums[j+1]){
                while(nums[j]==nums[j+1]){
                    j++;
                    if(j >= nums.length-1){
                        break;
                    }
                }
            } 
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1 };
        nums = removeDuplicates(nums);
        for(int x: nums){
            System.out.println(x);
        }
    }
}
