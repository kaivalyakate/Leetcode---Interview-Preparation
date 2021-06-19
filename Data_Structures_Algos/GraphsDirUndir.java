import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GraphsDirUndir {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
    }
}

class Graph{

    private List<List<Integer>> adjList;

    public void addEdge(int vertexOne, int vertexTwo){
        adjList.get(vertexOne).add(vertexTwo);
    }

    Graph(int numberOfVertices){
        for(int i=0;i<numberOfVertices;i++){
            adjList.add(new ArrayList<>());
            // For Adjency Matrix, Replace the above line by the below line
            // adjList.add(new ArrayList<>(Collections.nCopies(numberOfVertices, 0)));
        }
    }
}
