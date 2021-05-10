import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingChar {

    public static char GetFirstNonRepeating(String check){
        Map<Character, Integer> wordMap = new LinkedHashMap<>();
        for(char x: check.toCharArray()){
            if(!wordMap.containsKey(x)){
                wordMap.put(x, 1);
            } else {
                wordMap.put(x, wordMap.get(x)+1);
            }
        }
        for(Map.Entry<Character, Integer> entry: wordMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '$';
    } 
    
    public static void main(String[] args) {
        System.out.println(GetFirstNonRepeating("hello"));
    }
}
