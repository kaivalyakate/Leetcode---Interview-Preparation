import java.util.Arrays;

public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
