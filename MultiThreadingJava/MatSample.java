import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MatSample {

    public static int hammingWeight(int n) {
        int i = 0;
        if(n<0){
            n = ~n + 1;
        }
        while(n>0){
            if(n%2==1){
                i++;
            } 
            n = n/2;
        }
        return i;
    }

    public static void main(String[] args) {
        // Map<Integer, String> wordMap = new TreeMap<>();
        // wordMap.put(7, "K");
        // wordMap.put(1, "J");
        // wordMap.put(3, "F");

        // wordMap.entrySet()
        // .stream()
        // .sorted(Map.Entry.comparingByValue())
        // .forEach(System.out::println);

        // for(Map.Entry<Integer, String> entry: wordMap.entrySet()){
        // System.out.println(entry.getKey()+" "+entry.getValue());
        // }
        int []a = {1, 2, 3, 4, 5};
        System.out.println(hammingWeight(-3));
    }
}
