/**
 *
 * November 12, 2018
 * 
 * @author Samuel Hodges and Joseph Mel Rhoney
 * An interface for making graphs
 */
public interface Graph {
    
    /**
     * 
     * @return The number of elements in this graph. 
     */
    public int size();
    /**
     * 
     * @return true, if this graph has no elements; false, otherwise. 
     */
    public boolean isEmpty();
  
    /**
     * A method to modify the graph based on a depth first search algorithm. 
     * The parents of each vertex will be set based on the results of the 
     * depth first search. The color of all visited vertices will be set to
     * BLACK, and the d-Time Stamps and f-Time Stamps will be set to integer 
     * values based on the specific time stamp they had when visited during the 
     * depth first search
     */
    public void DFS();
    
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
    public void printAdjacencyMatrix();
    
    /**
     * 
     * @return a text print out of the graph's vertex info. One column will be
     * labeled vertex and will contain number entries for each vertex in the 
     * graph. One column will be labeled parent and will contain number entries 
     * representing the parent of the vertex, or null if the vertex has no parent.
     * One column will be labeled color, which will represent the color of the vertex. 
     * One column will be labeled d TimeStamp, it entries will represent the 
     * d time stamp of the vertex as an integer value. The last column will
     * be labeled f TimeStamp and will be 
     */
    public void printGraphInfo();
    
}   
  
