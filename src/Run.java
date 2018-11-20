public class Run {

    public static void main(String[] args) {

        int[][] test = {{0,1,1,0,1},{1,0,1,0,0},{1,1,0,1,0},{0,0,1,0,0},{1,0,0,0,0}};

        DepthFirstSearchGraph graph = new DepthFirstSearchGraph(test);

        graph.printAdjacencyMatrix();

        System.out.println(test.length);

    }
}
