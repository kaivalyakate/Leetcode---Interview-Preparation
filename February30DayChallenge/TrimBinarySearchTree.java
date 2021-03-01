public class TrimBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        BinarySearchTree bTree = new BinarySearchTree();
        bTree.InsertNode(root);
        bTree.InsertNode(new TreeNode(0));
        bTree.InsertNode(new TreeNode(2));
        bTree.InsertNode(new TreeNode(4));
        bTree.InsertNode(new TreeNode(3));
    }
}

class TreeNode {

    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {

    public TreeNode root;
    public TreeNode prev;

    public void InsertNode(TreeNode node) {
        if (this.root == null) {
            this.root = node;
        } else if (this.root.right == null && node.val > this.root.val) {
            this.root.right = node;
        } else if (this.root.left == null && node.val < this.root.val) {
            this.root.left = node;
        } else {
            TreeNode temp = this.root;
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

    public TreeNode deleteNode(TreeNode root){
        if(root==null){
            return root;
        }
        return root;
    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root.val<=low){
            root = root.left;
        } else if(root.val>=high){
            root = root.right;
        } else if(root.val>=low && root.val<=high){
            if(root.left.val<low){
                root.right = null;
            }
        }
        return new TreeNode(0);
    }
}