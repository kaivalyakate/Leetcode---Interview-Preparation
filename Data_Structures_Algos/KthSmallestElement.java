import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KthSmallestElement {

    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.InsertNode(new TreeNode(5));
        bst.InsertNode(new TreeNode(3));
        bst.InsertNode(new TreeNode(6));
        bst.InsertNode(new TreeNode(2));
        bst.InsertNode(new TreeNode(1));
        bst.InsertNode(new TreeNode(4));
        System.out.println(new KthSmallestElement().kthSmallest(bst.root, 3));
    }
}

class BinaryTree {
    TreeNode root = null;

    public void InsertNode(TreeNode node) {
        TreeNode temp = root;

        if (temp == null) {
            this.root = node;
        } else {
            while (temp != null) {
                if (node.val < temp.val) {
                    if (temp.left == null) {
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (node.val > temp.val) {
                    if (temp.right == null) {
                        temp.right = node;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

}

