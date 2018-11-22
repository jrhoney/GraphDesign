import java.util.*;

/**
 * November 12, 2018
 *
 * @author Samuel Hodges and Joseph Mel Rhoney
 */
public class DepthFirstSearchGraph implements Graph {

  private ArrayList<Vertex> vertexList;
  private List<Integer>[] adjacencyList;
  private int size, time;

  /**
   * @param adjacencyMatrix the Adjacency Matrix that defines the graph to be made this 2-D array
   *     must have values 0 or 1, else an edge can be determined, if user puts any number other than
   *     0 or 1 it will be treated as a 0.
   *     <p>This constructor will build an arrayList of references to all vertex objects in the
   *     graph. The constructor will also build a array of list will act as an Adjacency list for
   *     the graph. The size of the graph will be set to the size of the input parameters length
   */
  public DepthFirstSearchGraph(int[][] adjacencyMatrix) {
    vertexList = new ArrayList<>();
    adjacencyList = new List[adjacencyMatrix.length];

    for (int[] anAdjacencyMatrix : adjacencyMatrix) {
      vertexList.add(new Vertex());
    }

    for (int i = 0; i < adjacencyMatrix.length; i++) {
      adjacencyList[i] = new LinkedList<>();
      for (int j = 0; j < adjacencyMatrix[i].length; j++) {
        if (adjacencyMatrix[i][j] == 1) {
          adjacencyList[i].add(j);
        }
      }
    }

    size = adjacencyMatrix.length;
    time = 0;
  }

  /**
   * @return the size of the graph, as an integer, representing the number of vertices represented
   *     in the graph
   */
  @Override
  public int size() {
    return vertexList.size();
  }

  /** @return true, if this graph has no elements; false, otherwise. */
  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  /**
   * @param v the vertex whose edges are being requested
   * @return a linked list of other vertices that are connected to the vertex that is
   */
  public LinkedList getEdges(Vertex v) {
    return (LinkedList) adjacencyList[vertexList.indexOf(v)];
  }

  /**
   * A method to modify the graph based on a depth first search algorithm. The parents of each
   * vertex will be set based on the results of the depth first search. The color of all visited
   * vertices will be set to BLACK, and the d-Time Stamps and f-Time Stamps will be set to integer
   * values based on the specific time stamp they had when visited during the depth first search
   */
  @Override
  public void DFS() {
    for (Vertex v : vertexList) {
      v.setColor(Color.WHITE);
      v.setParent(null);
    }
    time = 0;
    for (Vertex v : vertexList) {
      if (v.getColor() == Color.WHITE) {
        DFSVisit(v);
      }
    }
  }

  /**
   * @param source the current vertex for which the depth first search is currently at in the
   *     algorithm. This method is to be recursively invoked by the DFS method.
   */
  private void DFSVisit(Vertex source) {
    time++;
    source.setdTimeStamp(time);
    source.setColor(Color.GRAY);

    Iterator it = getEdges(source).iterator();

    while (it.hasNext()) {
      int index = (int) it.next();
      if (vertexList.get(index).getColor() == Color.WHITE) {
        vertexList.get(index).setParent(source);
        DFSVisit(vertexList.get(index));
      }
    }
    source.setColor(Color.BLACK);
    time++;
    source.setfTimeStamp(time);
  }

  /**
   * This will display a n+1 by n+1 matrix of numbers, where n is the size of the graph. The first
   * column will represent the integer number of the connecting vertex, and the first row will
   * represent the vertex the connecting vertex is connected to. The rest of the matrix will be full
   * of 0's and 1's, where 1 represents a connection and a 0 represents no connection.
   */
  @Override
  public void printAdjacencyMatrix() {
    int[][] temp;
    temp = new int[vertexList.size()][vertexList.size()];

    for (int i = 0; i < adjacencyList.length; i++) {

      for (Object o : adjacencyList[i]) {
        temp[i][(int) o] = 1;
      }
    }

    // prints a blank space because the first column is also the id of vectors
    System.out.print("  ");

    // prints a row representing the vectors
    for (int i = 0; i < adjacencyList.length; i++) {
      System.out.print((i + 1) + " ");
    }

    System.out.println();

    for (int i = 0; i < temp.length; i++) {
      System.out.print((i + 1) + " ");
      for (int j = 0; j < temp[i].length; j++) {
        System.out.print(temp[i][j] + " ");
      }
      System.out.println();
    }
  }

  /**
   * a text print out of the graph's vertex info. One column will be labeled vertex and will contain
   * number entries for each vertex in the graph. One column will be labeled parent and will contain
   * number entries representing the parent of the vertex, or null if the vertex has no parent. One
   * column will be labeled color, which will represent the color of the vertex. One column will be
   * labeled d TimeStamp, it entries will represent the d time stamp of the vertex as an integer
   * value. The last column will be labeled f TimeStamp and will be labeled
   */
  @Override
  public void printGraphInfo() {
    int count = 1;
    for (Vertex v : vertexList) {
        Vertex vNow = v.getParent();
        int vNowParent = vertexList.indexOf(vNow);
      System.out.println("Vertex " + count + " parent:  "+ (vNowParent+1) + " " + v);
      count++;
    }
  }
}
