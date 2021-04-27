import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTree {

    public static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> ans = new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        } 
        queue.add(root);
        while(!queue.isEmpty()){
            List<TreeNode> tempArray = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode temp = queue.remove();
                if(temp.right!=null){
                    tempArray.add(temp.right);
                } 
                if(temp.left!=null){
                    tempArray.add(temp.left);
                }
            }
            if(!tempArray.isEmpty()){
                ans.add(tempArray.get(0));
                queue.addAll(tempArray);
            }
        }
        List<Integer> ans1 = new ArrayList<>();
        for(TreeNode x: ans){
            ans1.add(x.val);
        }
        return ans1;
    }
    

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(6);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(7);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(9);
        TreeNode a7 = new TreeNode(11);
        a1.left = a2;
        a1.right = a3;
        a3.right = a6;
        a6.right = a7;
        a2.right = a4;
        a2.left = a5;
        System.out.println(rightSideView(null));
    }
}
