import java.util.*;

public class LCIsSubTree {

    public static boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }

        if(root==null || subRoot==null){
            return false;
        }

        return (root.val==subRoot.val 
        && isIdentical(root.left, subRoot.left)
        && isIdentical(root.right, subRoot.right));
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        } 
        if(subRoot==null){
            return true;
        }

        if(isIdentical(root, subRoot)){
            return true;
        }
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }
    
    public static void main(String[] args) {
        // Tree One
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        // Tree Two
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(1);
        TreeNode node8 = new TreeNode(2);
        node6.left = node7;
        node6.right = node8;

        System.out.println(new LCIsSubTree().isSubtree(node1, node6));
    }
}
