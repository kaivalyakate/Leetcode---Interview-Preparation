import java.util.Arrays;
import java.util.LinkedList;

public class MoveZeros {

    public static int[] moveZeroes(int[] nums) {
        int firstZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                firstZero = i;
                break;
            }
        }
        int firstNonZero = 0;
        while(firstZero<nums.length || firstNonZero<nums.length){
            if(nums[firstNonZero]==0){
                while(nums[firstNonZero]==0){
                    if(nums[firstNonZero]==0){
                        firstNonZero++;
                    }
                }
            }
            if(firstZero<nums.length && firstNonZero<nums.length){
                int temp = nums[firstZero];
                nums[firstZero] = nums[firstNonZero];
                nums[firstNonZero] = temp;
                firstZero = firstNonZero;
                firstNonZero+=1;
            }
        }
        return nums;   
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[] { 1, 0, 3, 1, 2 })));
    }
}
