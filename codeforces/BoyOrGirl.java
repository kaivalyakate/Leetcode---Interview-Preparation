import java.util.HashMap;
import java.util.Scanner;

public class BoyOrGirl {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] userName = sc.next().toCharArray();
        
        HashMap<Character, Integer> characters = new HashMap<>();
        int ans = 0;
        for(int i=0;i<userName.length;i++){
            if(characters.get(userName[i])==null){
                characters.put(userName[i], 1);
                ans+=1;
            }
        }
        if(ans%2==0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
