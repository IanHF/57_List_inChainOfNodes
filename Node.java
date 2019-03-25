public class Node {
    private Object cargoRef;
    private Node   refToNextNode;

    public Node( Object cargoRef) {this.cargoRef = cargoRef;}

    public Node( Object cargoRef, Node refToNextNode) {
      this.cargoRef = cargoRef;
      this.refToNextNode = refToNextNode;}
    /**@return a string representation of this instance*/
    public String toString() {
        String result = cargoRef.toString() + " id " + super.toString();
        // Show rest of chain of nodes
        if( refToNextNode == null) {result += " [no next]";}
        else {result += " --> " + refToNextNode;}
        return result;
    }
    // // classic accessor and mutator
    public Node getRefToNextNode() {return this.refToNextNode;}

    public void setRefToNextNode( Node refToNextNode) 
    {this.refToNextNode = refToNextNode;}
}
