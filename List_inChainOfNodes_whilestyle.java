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
    Node toAddNode = new Node(val, headReference.getReferenceToNextNode());
    headReference.setReferenceToNextNode(toAddNode);
    return true;
  }
  
//CREDIT TO KYLE EDWARDS WHO DID THE CODE BELOW WITH ME IN CLASS ON 3/25/19
  public Node get(int element){
    Node currentNode = headReference.getReferenceToNextNode();
    for(int x = 0; x < element; x++){
      currentNode = currentNode.getReferenceToNextNode();
    }

    return currentNode;
  }

  public void set(Object val, int position){
    Node currentNode = new Node(val, get(position).getReferenceToNextNode());
    get(position-1).setReferenceToNextNode(currentNode);
  }

  public boolean add(Object val, int position){
    Node currentNode = get(position);
    Node newNode = new Node(val, currentNode.getReferenceToNextNode());
    currentNode.setReferenceToNextNode(newNode);
    return true;
  }

  public void remove(int position){
    Node prevNode = ( (position == 0) ? headReference : get(position-1));
    Node newNode = get(position);

    prevNode.setReferenceToNextNode(newNode);
  }
}
