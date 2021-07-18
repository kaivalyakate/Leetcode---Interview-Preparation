public class ReplaceElementsWithGreaterElementOnRight {

    public static int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max = arr[arr.length-1], i = arr.length-1;
        ans[i] = -1;
        i--;
        while(i>=0){
            ans[i] = max;
            if(arr[i]>max){
                max = arr[i];
            }
            i--;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(replaceElements(new int[]{400}));
    }
}
