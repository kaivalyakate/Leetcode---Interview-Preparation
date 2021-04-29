import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

    public static boolean isPalindrome(List<TreeNode> tempArray){
        int i = 0, j = tempArray.size()-1;
        while(i<j){
            if(tempArray.get(i).val!=tempArray.get(j).val){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> ans = new ArrayList<>();
        if (root == null) {
            return true;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> tempArray = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode temp = queue.remove();
                if (temp.right != null) {
                    tempArray.add(temp.right);
                } else{
                    tempArray.add(new TreeNode(-1));
                }
                if (temp.left != null) {
                    tempArray.add(temp.left);
                } else {
                    tempArray.add(new TreeNode(-1));
                }
            }
            if (tempArray.size()>1) {
                if(!isPalindrome(tempArray)){
                    return false;
                }
                queue.addAll(tempArray);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(6);
        TreeNode a2 = new TreeNode(7);
        TreeNode a3 = new TreeNode(7);
        TreeNode a4 = new TreeNode(9);
        //TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(9);
        //TreeNode a7 = new TreeNode(11);
        a1.left = a2;
        a1.right = a3;
        a3.left = a6;
        a2.right = a4;
        System.out.println(isSymmetric(a1));
    }
}
