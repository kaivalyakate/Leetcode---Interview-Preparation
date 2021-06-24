import java.util.*;
/**
 * MergeTwoBinaryTreesInSortedOrder
 */
public class MergeTwoBinaryTreesInSortedOrder {

    private static Stack<TreeNode> stackOne = new Stack<TreeNode>();
    private static Stack<TreeNode> stackTwo = new Stack<TreeNode>();

    public static void TreeOneMin(TreeNode root){
        TreeNode current = root;
        while(current!=null){
            stackOne.push(current);
            current = current.left;
        }
    }

    public static void TreeTwoMin(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            stackTwo.push(current);
            current = current.left;
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        stackOne.push(root1);
        stackTwo.push(root2);
        while(!stackOne.isEmpty() || !stackTwo.isEmpty()){
            TreeNode node1 = stackOne.pop();

        }
        return null;
    }

    
    public static void main(String[] args) {
        
    }
}