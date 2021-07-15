import java.util.List;

public class AnagramJava {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] aChar = a.toLowerCase().toCharArray();
        char[] bChar = b.toLowerCase().toCharArray();
        int[] aMap = new int[26];
        int[] bMap = new int[26];
        for(int i=0;i<a.length();i++){
            int index = aChar[i]-97;
            aMap[index]++;
        }
        for(int i=0;i<b.length();i++){
            int index = bChar[i]-97;
            bMap[index]++;
        }
        for(int i=0;i<aChar.length;i++){
            if(aMap[aChar[i]-97]!=bMap[aChar[i]-97]){
                return false;
            }
        }
        for (int i = 0; i < bChar.length; i++) {
            if (bMap[bChar[i] - 97] != aMap[bChar[i] - 97]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] one = new char[]{'a', 'b', 'c'};
        int a = one[1]-97;
        System.out.println(isAnagram("Hell", "hello"));
        System.out.println("Help");
    }

}
