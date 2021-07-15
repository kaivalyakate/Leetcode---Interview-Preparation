import java.util.*;
public class FindKClosestElements {

    public static List<Integer> findKClosest(int[] arr, int k, int x, int index){
        List<Integer> ans = new ArrayList<>();
        int i = index, j = index+1;
        while(k!=0){
            if((Math.abs(arr[i]-x)<Math.abs(arr[j]-x)) || (Math.abs(arr[i]-x)==Math.abs(arr[j]-x) && arr[i]<arr[j])){
                ans.add(arr[i]);
                i--;
                k--;
            } else {
                if(j<arr.length-1){
                    ans.add(arr[j]);
                    j++;
                    k--;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        if(arr.length==0 || k>arr.length){
            return null;
        }
        if(x<=arr[0]){
            for(int j=0;j<k;j++){
                ans.add(arr[j]);
            }
        } else if(x>=arr[arr.length-1]){
            for(int j=arr.length-1;j>arr.length-1-k;j--){
                ans.add(arr[j]);
            }
        } else {
            int index = 0;
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]<=x){
                    index = j;
                } else {
                    ans = findKClosest(arr, k, x, index);
                    return ans;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
    
    public static void main(String[] args) {
        List<Integer> ans = findClosestElements(new int[]{}, 1, 1);
        for(Integer x: ans){
            System.out.println(x);
        }
    }
}
