import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class TeamRating {
    
    public static int GetTeams(List<Integer> array) {
        HashMap<Integer, Integer> playerMapping = new HashMap<>();
        int i = 0;
        for(int x: array){
            if(playerMapping.get(x)==null){
                playerMapping.put(x, i);
            }
            i++;
        } 
        i=0;
        
        return -1; 
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{2, 5, 3, 4, 1}));
        int ans = GetTeams(array);
        System.out.println(ans);
    }
}
