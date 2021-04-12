public class SignFunc {

    public static int arraySign(int[] nums) {
        int ncount = 0;
        for(int x: nums){
            if(x<0){
                ncount+=1;
            } else if(x==0){
                return 0;
            }
        }

        if(ncount%2==0){
            return 1;
        } else {
            return -1;
        }

    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(nums));
    }
}
