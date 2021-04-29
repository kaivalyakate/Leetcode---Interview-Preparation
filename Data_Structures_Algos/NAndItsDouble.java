import java.util.HashMap;

public class NAndItsDouble {

    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Boolean> ansMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%2==0 && ansMap.containsKey(arr[i] / 2)) || ansMap.containsKey(arr[i]*2)){
                return true;
            } else {
                ansMap.put(arr[i], true);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(new NAndItsDouble().checkIfExist(new int[]{3, 1, 7, 11}));
    }
}
