import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ValidBinaryTree {

    public static boolean isValidBST(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if(temp.right!=null){
                if(temp.right.val>temp.val){
                    queue.add(temp.right);
                } else {
                    return false;
                }
            }
            if(temp.left!=null){
                if(temp.left.val<temp.val){
                    queue.add(temp.left);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        a1.left = new TreeNode(1);
        System.out.println(isValidBST(a1));
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.val = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.val = data;
        this.left = left;
        this.right = right;
    }
}
