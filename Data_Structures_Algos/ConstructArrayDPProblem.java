/**
 * ConstructArrayDPProblem
 */
public class ConstructArrayDPProblem {


    public static long constructArray(int[] originalArray, int[] modifiedArray, int n, int k, int index, long count){
        if(k==0){
            return count%1000000007;
        }
        if(index==modifiedArray.length-1){
            count++;
            k--;
            return constructArray(originalArray, originalArray.clone(), n, k, 1, count);
        }

        for(int i=1;i<=k;i++){
            if((index==1 & originalArray[0]==i) || (index==n-2 & originalArray[n-1]==i)){
                continue;
            } else {
                modifiedArray[index] = i;
                index++;
                count = constructArray(originalArray, modifiedArray, n, k, index, count);
            }
        }
        return count%1000000007;
    }

    public static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.
        int[] originalArray = new int[n];
        originalArray[0] = 1;
        originalArray[originalArray.length-1] = x;
        return constructArray(originalArray, originalArray.clone(), n, k, 1, 0);
    }

    public static void main(String[] args) {
        System.out.println(countArray(4, 3, 2));
    }
}