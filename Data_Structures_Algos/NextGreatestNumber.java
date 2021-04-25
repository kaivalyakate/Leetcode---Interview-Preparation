import java.util.Arrays;

public class NextGreatestNumber {

    public static int NextNumber(int num) {
        char[] num1 = ("" + num).toCharArray();
        int i = num1.length - 1;
        while (i > 0) {
            int j = i - 1;
            while (j >= 0) {
                if (Character.getNumericValue(num1[j]) >= Character.getNumericValue(num1[i])) {
                    j--;
                } else if (num1[j] < num1[i]) {
                    char temp = num1[j];
                    num1[j] = num1[i];
                    num1[i] = temp;
                    if (i - j > 1) {
                        Arrays.sort(num1, j + 1, num1.length);
                        return Integer.parseInt(String.valueOf(num1));
                    } else {
                        return Integer.parseInt(String.valueOf(num1));
                    }
                }
            }
            i--;
        }
        return Integer.parseInt(String.valueOf(num1));
    }

    public static void main(String[] args) {
        System.out.println(NextNumber(101));
    }
}
