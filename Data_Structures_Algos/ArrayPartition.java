import java.util.Arrays;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
}
