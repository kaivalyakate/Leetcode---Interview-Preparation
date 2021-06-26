import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphsDirUndir {

    public static boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean[] visited = new boolean[arr.length];
        while(!queue.isEmpty()){
            int node = queue.remove();
            visited[node] = true;
            if(arr[node]==0){
                return true;
            }
            int posOne = arr[node]+node;
            int posTwo = node-arr[node];
            if(posOne<arr.length && visited[posOne]!=true){
                queue.add(posOne);
            }
            if(posTwo>=0 && visited[posTwo]!=true){
                queue.add(posTwo);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Graph graph = new Graph(10);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 2);
        // graph.addEdge(3, 1);
        // graph.addEdge(3, 2);
        // graph.addEdge(3, 4);
        // graph.addEdge(4, 1);
        // graph.addEdge(4, 0);
        // graph.depthFirstSearch(0);
        System.out.println(canReach(new int[]{ 4, 2, 3, 0, 3, 1, 2}, 5));
    }
}

class Graph {

    public List<List<Integer>> adjList;
    private int numberOfVertices;
    HashSet<Integer> visitedNodes = new HashSet<>();

    // Add Vertices + Connections to the graph;
    // Update the Adjancency List
    public void addEdge(int vertexOne, int vertexTwo) {
        adjList.get(vertexOne).add(vertexTwo);
    }

    // Constructor for Easy Initialization of The graph with fixed number of
    // Vertices
    Graph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.adjList = new ArrayList<List<Integer>>();
        for (int i = 0; i < numberOfVertices; i++) {
            adjList.add(new ArrayList<>());
            // For Adjency Matrix, Replace the above line by the below line
            // adjList.add(new ArrayList<>(Collections.nCopies(numberOfVertices, 0)));
        }
    }

    // Prining Connections of All Vertices
    public void printConnections() {
        for (int i = 0; i < numberOfVertices; i++) {
            if(adjList.get(i).size()>0 || adjList.get(i)!=null){
                System.out.println("Vertex " + i + " is connected to ->");
                for (int j = 0; j < adjList.get(i).size(); j++) {
                    System.out.print(adjList.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public void depthFirstSearch(int node){
        visitedNodes.add(node);
        System.out.println(node);
        for(int i=0;i<adjList.get(node).size();i++){
            if(!visitedNodes.contains(adjList.get(node).get(i))){
                depthFirstSearch(adjList.get(node).get(i));
            } else {
                return;
            }
        }
    }
}
