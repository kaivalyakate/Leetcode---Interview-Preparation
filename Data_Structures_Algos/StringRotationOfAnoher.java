public class StringRotationOfAnoher {

    public static int compare(StringBuilder s, StringBuilder t) {
        for(int i=0;i<t.length();i++){
            s.append(s.charAt(i));
            if(s.substring(i+1, s.length()).equals(t.toString())){
                return 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(compare(new StringBuilder("abc"), new StringBuilder("cba")));
    }
}
