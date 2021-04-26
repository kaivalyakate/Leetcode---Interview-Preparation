import java.util.Arrays;
import java.util.LinkedList;

public class MoveZeros {

    public static int[] moveZeroes(int[] nums) {
        int fZero = 0;
        boolean flag = false;
        if(nums.length==1){
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                fZero = i;
                flag = true;
                break;
            }
        }
        for (int i = fZero; i < nums.length; i++) {
            if(flag=true){
                if (nums[i] != 0) {
                    nums[fZero] = nums[i];
                    nums[i] = 0;
                    fZero++;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[] { 1 })));
    }
}
