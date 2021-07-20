import java.util.*;
public class StepsPerm {

    public static int calculateSteps(int n, int count, Map<Integer, Integer> map){
        if(n==0){
            count++;
            return count;
        } else if(n<0){
            return 0;
        } else if(map.containsKey(n)){
            return map.get(n);
        }

        count = calculateSteps(n-1, count, map)+calculateSteps(n-2, count, map)+calculateSteps(n-3, count, map);
        map.put(n, count);
        return count;
    }
    
    public static int stepPerms(int n) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        return calculateSteps(n, 0, map);
    }

    public static void main(String[] args) {
        System.out.println(stepPerms(5));   
    }
}
