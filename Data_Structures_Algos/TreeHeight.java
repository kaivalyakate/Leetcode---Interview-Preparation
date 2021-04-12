import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TreeHeight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        Tree tree = new Tree();
        for(int x=0;x<n;x++){
            nodes[x] = sc.nextInt(); 
            if(nodes[x]==-1){
                tree.root = new Node(x);
            }
            List<Node> elements = new ArrayList<>();
            elements.add(new Node(nodes[x]));
            tree.parents.add(elements);
        }

        System.out.println(tree.GetDepth(tree.root, nodes));
        sc.close();
    }
}

class Node{

    int value;

    Node(int value){
        this.value = value;
    }

}

class Tree{

    Node root;
    List<List<Node>> parents = new ArrayList<>();

    public int GetDepth(Node root, int[] nodes){

        for(int x=0;x<nodes.length;x++){
            if(nodes[x]==-1){
                parents.get(x).add(new Node(nodes[x]));
            } else {
                parents.get(nodes[x]).add(new Node(nodes[x]));
            }
        }

        int depth = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> innerQueue = new LinkedList<>();
        if(this.root!=null){
            queue.add(this.root.value);
        } else {
            return 0;
        } 
        while(!queue.isEmpty()){
            for(int i=0;i<this.parents.get(queue.peek()).size();i++){
                innerQueue.add(this.parents.get(queue.peek()).get(i).value);
            }
            queue = innerQueue;
            depth++;
        }

        return depth;
    }
}
