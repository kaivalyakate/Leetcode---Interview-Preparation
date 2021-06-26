import java.util.List;
import java.util.Stack;

public class PlusOneArray {

    public static int[] plusOne(int[] digits) {
        Stack<Integer> ans = new Stack<>();
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] + 1 >= 10) {
                    ans.push((digits[i] + 1) % 10);
                    carry = (digits[i] + 1) % 10;
                } else {
                    ans.push(digits[i] + 1);
                }
            } else {
                if (digits[i] + carry >= 10) {
                    ans.push((digits[i] + carry) % 10);
                    carry = (digits[i] + carry) % 10;
                } else {
                    ans.push(digits[i] + carry);
                }
            }
        }
        int[] answer = new int[ans.size()];
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            answer[i] = ans.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] digits = { };
        int[] ans = plusOne(digits);
        for (int x : ans) {
            System.out.println(x);
        }
    }
}
