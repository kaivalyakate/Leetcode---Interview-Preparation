public class BinarySum {

    public static String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder str = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0 && a.charAt(i--) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1') {
                carry++;
            }
            str.append(carry % 2);
            carry /= 2;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
