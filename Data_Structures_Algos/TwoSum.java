import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int[] ans = new int[2];
        Arrays.sort(numbers);
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                ans[0] = i;
                ans[1] = j;
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        // int[] numbers = new int[] { 2, 7, 11, 15 };
        // int target = 9;
        // System.out.println(twoSum(numbers, target));
        TwoSum toSum = new TwoSum();
        Class cls = toSum.getClass();
        Method[] methods = cls.getMethods();
        methods[0].getName();
        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
