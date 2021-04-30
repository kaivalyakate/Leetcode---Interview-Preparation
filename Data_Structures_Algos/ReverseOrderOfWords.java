public class ReverseOrderOfWords {

    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        int i = 0, j = ans.length-1;
        while(i<j) {
            String temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++; j--;
        }
        return String.join(" ", ans);
    }
    
    public static void main(String[] args) {
        System.out.println(new ReverseOrderOfWords().reverseWords("abc cdf hji"));
    }
}
