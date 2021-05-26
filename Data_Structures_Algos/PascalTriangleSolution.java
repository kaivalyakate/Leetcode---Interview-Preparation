import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleSolution {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(new Integer[]{1}));
        for(int i=1;i<numRows;i++){
            List<Integer> sample = new ArrayList<>();
            List<Integer> prev = ans.get(i-1);
            sample.add(1);
            sample.set(i-1, 1);
            for(int j=1;j<i;j++){
                int element = prev.get(i-1)+prev.get(i);
                prev.add(element);
            }
            ans.add(sample);
        }
        return ans;
    } 
    
    public static void main(String[] args) {
        System.out.println(generate(5));   
    }
}
