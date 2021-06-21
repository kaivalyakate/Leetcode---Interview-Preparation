import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalBST {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();
        ans.add(Arrays.asList(new Integer[]{root.val}));
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            List<TreeNode> tempQueue = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode tempNode = queue.remove(0);
                if(tempNode.left!=null){
                    tempQueue.add(tempNode.left);
                    temp.add(tempNode.left.val);
                }
                if(tempNode.right!=null){
                    tempQueue.add(tempNode.right);
                    temp.add(tempNode.right.val);
                }
            }
            queue = tempQueue;
            if(temp.size()>0){
                ans.add(temp);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        List<List<Integer>> ans = levelOrder(node1);
        for(List<Integer> x: ans){
            System.out.println(x.toString());
        }
    }
}
