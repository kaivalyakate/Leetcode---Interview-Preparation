import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 & n==1){
            nums1[0] = nums2[0]; 
        } else if(m>0 & n>0){
            for(int i=m;i<m+n;i++){
                nums1[i] = nums2[i-n];
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        merge(new int[]{1, 0}, 1, new int[]{}, 0);
    }
}


/**
 * 
 */
