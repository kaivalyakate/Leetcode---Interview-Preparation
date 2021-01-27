public class Zeros {

    public static int getIndex(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String s = "0";
        System.out.println(getIndex(s));
    }
}
