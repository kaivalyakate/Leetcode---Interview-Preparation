import java.util.*;

public class MirrorBinarySearchTree {

    public static boolean IsMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return true;
        }

        if (node1 != null && node2 != null && node1.val==node2.val){
            return (IsMirror(node1.left, node2.right) &&
            IsMirror(node1.right, node2.left));
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        return IsMirror(root, root);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.left = node5;
        System.out.println(new MirrorBinarySearchTree().isSymmetric(node1));
    }
}
