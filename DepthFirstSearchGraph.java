import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * November 12, 2018
 * 
 * @author Samuel Hodges and Joseph Mel Rhoney
 */
public class DepthFirstSearchGraph implements Graph {
    
    private ArrayList<Vertex> vertexList;
    private List<Integer>[] adjacencyList;
    private int size;
    
    /**
     * 
     * @param adjacencyMatrix the Adjacency Matrix that defines the graph to be made
     * this 2-D array must have values 0 or 1, else an edge can be determined, 
     * if user puts any number other than 0 or 1 it will be treated as a 0.
     * 
     * This constructor will build an arrayList of references to all vertex 
     * objects in the graph. The constructor will also build a array of list 
     * will act as an Adjacency list for the graph. The size of the graph will be
     * set to the size of the input parameters length
     */
    public DepthFirstSearchGraph(int[][] adjacencyMatrix){
        size = adjacencyMatrix.length;
    }
    
    /**
     * 
     * @return the size of the graph, as an integer, representing the number of 
     * vertices represented in the graph
     */
    @Override
    public int size(){
        return -1;
    }
    
    /**
     * 
     * @return true, if this graph has no elements; false, otherwise. 
     */
    @Override
    public boolean isEmpty(){
        return true;
    }
     
    /**
     * 
     * @param v the vertex whose edges are being requested
     * @return a linked list of other vertices that are connected to the
     * vertex that is 
     */
    public LinkedList getEdges(Vertex v){
        return null;
    }
    
    /**
     * A method to modify the graph based on a depth first search algorithm. 
     * The parents of each vertex will be set based on the results of the 
     * depth first search. The color of all visited vertices will be set to
     * BLACK, and the d-Time Stamps and f-Time Stamps will be set to integer 
     * values based on the specific time stamp they had when visited during the 
     * depth first search
     */
    @Override
    public void DFS(){
        
    }
    
    /**
     * 
     * @param source the current vertex for which the depth first search is 
     * currently at in the algorithm. This method is to be recursively invoked
     * by the DFS method.
     */
    private void DFSVisit(Vertex source){
        
    }  
    
        /**
     * 
     * @return a text representation of the adjacency matrix that describes 
     * the graph the method was called on
     * 
     * This will display a n+1 by n+1 matrix of numbers, where n is the size of
     * the graph. The first column will represent the integer number of the 
     * connecting vertex, and the first row will represent the vertex the 
     * connecting vertex is connected to. The rest of the matrix will be
     * full of 0's and 1's, where 1 represents a connection and a 0 represents
     * no connection.
     */
    @Override
    public String printAdjacencyMatrix(){
        return null;
    }
    
    /**
     * 
     * @return a text print out of the graph's vertex info. One column will be
     * labeled vertex and will contain number entries for each vertex in the 
     * graph. One column will be labeled parent and will contain number entries 
     * representing the parent of the vertex, or null if the vertex has no parent.
     * One column will be labeled color, which will represent the color of the vertex. 
     * One column will be labeled d TimeStamp, it entries will represent the 
     * d time stamp of the vertex as an integer value. The last column will
     * be labeled f TimeStamp and will be labeled
     */
    @Override
    public String printGraphInfo(){
        return null;
    }
    
}
