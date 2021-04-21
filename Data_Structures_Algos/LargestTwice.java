import java.util.Arrays;
import java.util.Collections;

public class LargestTwice {

    public static int dominantIndex(int[] nums) {
        int max = 0, idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                idx = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if((max)<(nums[i]*2) && i!=idx){
                return -1;
            }
        }
        return idx;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,2,3};
        System.out.println(dominantIndex(nums));
    }
}
