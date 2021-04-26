import java.util.HashMap;

public class CountAndSayNum {

    public static String ConvertNum(int n, HashMap<String, String> dict){
        String ans = "";
        if(n==1){
            return "1";
        } else {
            if(dict.get(n-1+"")!=null){
                int[] cnt = new int[Integer.MAX_VALUE];
                char[] prevRes = dict.get(n-1+"").toCharArray();
                for(char x: prevRes){
                    if(cnt[Integer.parseInt(x+"")]==0){
                        cnt[Integer.parseInt(x+"")]+=1;
                    }
                }
                for(char x: prevRes){
                    ans+=cnt[Integer.parseInt(x+"")]+x;
                }
            }
        }
        return ans;
    }

    public static String countAndSay(int n) {
        HashMap<String, String> dict = new HashMap<>();
        String ans = "";
        if(n==1){
            dict.put("1", "1");
            return ConvertNum(n, dict);
        } else {
            countAndSay(n-1);
            ans = ConvertNum(n, dict);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
