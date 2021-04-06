public class TrappingRainWater {

    public static int TrappedRainWater(int[] height) {
        int ans=0;
        for(int i=1;i<height.length;i++){
            int left_max = 0, right_max = 0;
            for(int j=i;j>=0;j--){
                left_max = Math.max(left_max, height[j]);
            }

            for (int j = i; j < height.length; j++) {
                right_max = Math.max(right_max, height[j]);
            }

            ans += Math.min(left_max, right_max) - height[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] height = new int[]{ 4, 2, 0, 3, 2, 5 };
        System.out.println(TrappedRainWater(height));
    }

}
