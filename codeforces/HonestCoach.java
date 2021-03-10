import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HonestCoach {
    public static int GetMaxMin(List<Integer> athleteStrength) {
        Collections.sort(athleteStrength);
        int result = athleteStrength.get(athleteStrength.size()-1)-athleteStrength.get(0);
        for(int i=0;i<athleteStrength.size();i++){
            for(int j=i+1;j<athleteStrength.size();j++){
                result = Math.min(result, athleteStrength.get(j)-athleteStrength.get(i));
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        while(t!=0){
            int n = sc.nextInt();
            List<Integer> athleteStrength = new ArrayList<>();
            for(int i=0;i<n;i++){
                athleteStrength.add(sc.nextInt());
            }
            ans.add(GetMaxMin(athleteStrength));
            t--;
        }
        for(int a: ans){
            System.out.println(a);
        }
        sc.close();
    }
}
