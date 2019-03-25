public class List_inChainOfNodes_whilestyle{
  private Node hRef;
    /**Construct an empty list*/
  public List_inChainOfNodes(){
    hRef = new Node("Head of list", null);}
    /**@return the number of elements in this list*/
  public int size() {
    int size = 0;
    Node currentRef = hRef.getRefToNextNode();
    while(currentRef instanceof Node){size++; currentRef = currentRef.getRefToNextNode();}
    return size;}    
     /**@return a string representation of this list format: # elements [element0,element1,element2,] */
  public String toString() {
    String retString = "elements [";
    Node currentRef = hRef.getRefToNextNode();
    while(currentRef instanceof Node){retString += currentRef.toString() + ", "; currentRef = currentRef.getRefToNextNode();}
    return retString + "]";}
    /**Append @value to the head of this list. @return true, in keeping with conventions yet to be discussed*/
  public boolean addAsHead( Object val) {
    Node toAddNode = new Node(val, hRef.getRefToNextNode());
    hRef.setRefToNextNode(toAddNode);
    return true;}
}