import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class JavaSingleDimArrayProblemHRR {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int pos = queue.remove();
            set.add(pos);
            if(pos==game.length-1 || pos+leap>=game.length){
                return true;
            }
            if(pos+leap<game.length && game[pos+leap]==0 && !set.contains(pos+leap)){
                queue.add(pos+leap);
            }
            if(game[pos+1]==0 && !set.contains(pos+1)){
                queue.add(pos+1);
            }
            if(pos-1>=0 && game[pos-1]==0 && !set.contains(pos-1)){
                queue.add(pos-1);                  
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(canWin(3, new int[] { 0,0,1,1,1,0 }));;
    }
}
