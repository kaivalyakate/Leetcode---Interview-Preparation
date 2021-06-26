/**
 * PathSum
 */
public class PathSum {

    public static boolean CalculateSum(TreeNode root, int targetSum, int sum){
        if(root==null){
            return false;
        }
        if(root.val+sum==targetSum && root.left==null && root.right==null){
            return true;
        } 
        return CalculateSum(root.left, targetSum, sum+root.val) 
            || CalculateSum(root.right, targetSum, sum+root.val);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return CalculateSum(root, targetSum, 0);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(-2);
        TreeNode node2 = new TreeNode(-3);
        node1.right = node2;
        System.out.println(hasPathSum(node1, -5));
    }
}