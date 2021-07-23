public class MaximumNumberOfPointsWIthCost {

    public static long maxPointsHelper(int[][] points, long sum, long max, int row, int col, long maxCount){
        if(maxCount>Math.pow(points[0].length, points.length)){
            return max;
        }
        if(row==points.length){
            if(sum>max){
                max = sum;
            }
            return maxPointsHelper(points, 0, max, 0, 0, maxCount);
        }

        for(int i=0;i<points[0].length;i++){
            sum+=points[row][i]-Math.abs(col-i);
            row++;
            maxCount++;
            max = maxPointsHelper(points, sum, max, row, i, maxCount);
        }
        return max;
    }

    public static long maxPoints(int[][] points) {
        
        return maxPointsHelper(points, 0, 0, 0, 0, 0);
    }
    

    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 2, 3}, {1, 5, 1}, {3, 1, 1}};
        maxPoints(points);
    }
}
