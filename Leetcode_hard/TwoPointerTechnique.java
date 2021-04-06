public class TwoPointerTechnique {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 7, 10, 14, 15, 16};
        int sum = 24;
        int i=0, j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==sum){
                System.out.println(numbers[i]+" = "+numbers[j]+" "+sum);
                break;
            } else if(numbers[i]+numbers[j]>sum){
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Process Done");
    }
}
