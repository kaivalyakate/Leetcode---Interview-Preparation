import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    List<Integer> arr = new ArrayList<>();

    public void inOrder(BNode root, int k){
        if(root==null)
            return;
        inOrder(root.left, k);
        arr.add(root.data);
        inOrder(root.right, k);
    } 
    
    public int kthSmallest(BNode root, int k) {
        inOrder(root, k);
        return arr.get(k-1);
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.InsertNode(new BNode(5));
        bst.InsertNode(new BNode(3));
        bst.InsertNode(new BNode(6));
        bst.InsertNode(new BNode(2));
        bst.InsertNode(new BNode(1));
        bst.InsertNode(new BNode(4));
        System.out.println(new KthSmallestElement().kthSmallest(bst.root, 1));
    }
}

class BinaryTree{
    BNode root = null;

    public void InsertNode(BNode node){
        BNode temp = root;

        if(temp==null){
            this.root = node;
        } else {
            while(temp!=null){
                if(node.data<temp.data){
                    if(temp.left==null){
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if(node.data>temp.data){
                    if(temp.right==null){
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

    int data;
    BNode left;
    BNode right;

    BNode(int data){
        this.data = data;
    }
}
