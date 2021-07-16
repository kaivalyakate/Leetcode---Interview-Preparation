import java.util.Arrays;


// When you have a Key-Value pair and you wish to sort these values efficiently, 
// use the following method.
// In the following function the array values gives out the index of the items present in the
// values array in sorted order.
public class SortByValue {

    public static int[] sortByValue(int[] arr, int[] values){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = values[i]*1000+i;
        }
        Arrays.sort(ans);

        for(int i=0;i<arr.length;i++){
            ans[i] = ans[i]%1000;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] ans = sortByValue(new int[]{1, 2, 3, 4}, new int[]{5, 1, 3, 8});
        for(int x: ans){
            System.out.println(x);
        }
    }
}
