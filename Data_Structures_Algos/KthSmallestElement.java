import java.util.LinkedList;

public class KthSmallestElement {

    public int kthSmallest(BNode root, int k) {
        LinkedList<BNode> stack = new LinkedList<BNode>();
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
        bst.InsertNode(new BNode(5));
        bst.InsertNode(new BNode(3));
        bst.InsertNode(new BNode(6));
        bst.InsertNode(new BNode(2));
        bst.InsertNode(new BNode(1));
        bst.InsertNode(new BNode(4));
        System.out.println(new KthSmallestElement().kthSmallest(bst.root, 3));
    }
}

class BinaryTree {
    BNode root = null;

    public void InsertNode(BNode node) {
        BNode temp = root;

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

class BNode{

    int val;
    BNode left;
    BNode right;

    BNode(int data){
        this.val = data;
    }
}

