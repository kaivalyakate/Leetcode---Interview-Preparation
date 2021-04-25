public class ReplaceCharacter {

    public static String ReplaceCharacterString(String str, char a1, char a2){
        char[] ans = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ans[i]==a1){
                ans[i] = a2;
            } else if(ans[i]==a2){
                ans[i] = a1;
            }
        }
        String ans1 = "";
        for(char x: ans){
            ans1 += x;
        }
        return ans1;

    }
    
    public static void main(String[] args) {
        
    }
}
