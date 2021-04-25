import java.util.HashMap;
import java.util.Map;

public class RandomPractice {
    
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "K");
        map.put(2, "C");
        map.put(4, "Z");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey());

        System.out.println(map.toString());
    }
}

class A{
    private int data = 10;
    
    class B{
        public void K() {
            System.out.println("KK " + data);
        }
    }
}
