/**
 * 
 * November 12, 2018
 * 
 * Vertex: A node which holds data used in depth first search.
 * 
 * @author Joseph Mel Rhoney and Samuel Hodges
 */
public class Vertex {
    private Vertex parent;
    private Color color;
    private int dTimeStamp;
    private int fTimeStamp;
    
    /**
     * the constructor for a default undiscovered vertex
     */
    public Vertex() {        
        parent = null;
        color = Color.WHITE;
        dTimeStamp = 0;
        fTimeStamp = 0;
    }
   
    /**
     * 
     * Sets the parent vertex of the vertex. 
     * Set by DFS
     * 
     * @param parent the vertex to be made a parent
     */
    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    /**
     * 
     * Sets the discovery time of the vertex to some int
     * 
     * @param dTimeStamp 
     */
    public void setdTimeStamp(int dTimeStamp) {
        this.dTimeStamp = dTimeStamp;
    }

    /**
     * 
     * Sets the final time of the vertex to some int
     * 
     * @param fTimeStamp 
     */
    public void setfTimeStamp(int fTimeStamp) {
        this.fTimeStamp = fTimeStamp;
    }
    
    /**
     * 
     * Sets the color (Discovered is GREY and finished is BLACK)
     * 
     * @param color 
     */
    public void setColor(Color color){
        this.color = color;
    }

    /**
     * 
     * gets the parent vertex that is connected to each vertex when DFS is used.
     * 
     * @return that vertex
     */
    public Vertex getParent() {
        return parent;
    }

    /**
     * 
     * @return the time stamp when the vertex is marked discovered
     */
    public int getdTimeStamp() {
        return dTimeStamp;
    }

    /**
     * 
     * @return the time stamp when the vertex is marked finished
     */
    public int getfTimeStamp() {
        return fTimeStamp;
    }
    
    /**
     * 
     * @return the color of the vertex 
     * (Undiscovered is WHITE, discovered is GREY and finished is BLACK)
     */
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "color=" + color +
                ", dTimeStamp=" + dTimeStamp +
                ", fTimeStamp=" + fTimeStamp +
                '}';
    }
}
