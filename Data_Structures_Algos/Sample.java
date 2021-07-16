import java.util.*;
public class Sample {
    public static int kthSmallest(int[][] matrix, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans.add(matrix[i][j]);
            }
        }
        Collections.sort(ans);
        if(k-1<=ans.size()-1){
            return ans.get(k-1);
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // int[][] matrix = new int[][]{{-5}};
        // System.out.println(kthSmallest(matrix, 1));
        Map<Integer, Integer> mapping = new HashMap<>();
        mapping.put(0, 2);
        mapping.put(1, 1);
        mapping.put(2, 1);
        mapping.entrySet().stream().sorted(Map.Entry.comparingByValue());
        for(Map.Entry<Integer, Integer> keyMap: mapping.entrySet()){
            System.out.println(keyMap.getKey()+" "+keyMap.getValue());
        }
    }
}
