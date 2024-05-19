package pboo;

public class GraphMain {
	public static void main(String[] args) {
        Graph graph = new Graph(5);
        //menambahkan vertex
        graph.addVertex('A'); // 0 start for dfs
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        //menambahkan edge
        graph.addEdge(0,1); //AB
        graph.addEdge(1, 3); //BD
        graph.addEdge(3, 0); //DA
        graph.addEdge(0, 2); //AC
        graph.adjacencyMatrix();
        System.out.println();
    }
}

