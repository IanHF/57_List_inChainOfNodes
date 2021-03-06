/**
 Test list features.
 */
//added tweaks done by me and kyle on wednesday - 3/28/19

public class UserOfList {
  public static void main( String[] args ) {
    List_inChainOfNodes_whilestyle list = new List_inChainOfNodes_whilestyle();
    //List_inChainOfNodes_recursion list = new List_inChainOfNodes_recursion();

    System.out.println( "number of elements: " + list.size() );

     // the spec requests that toString include the size
     System.out.println( "empty list: " + list
                       + System.lineSeparator());

     /* Populate the list with elements.
        Create the test data in an array, for the programming
        convenience of being able to loop through it.
     */
     String[] elements = new String[]{"y","u","t","S",};
         /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
            for convenient way to init an array of Strings */
     int elemIndex;
     for( String elem : elements ) {
         list.addAsHead(elem);
         System.out.println( "number of elements: " + list.size() );
     }
     System.out.println( "populated list: " + list + System.lineSeparator());

     list.add("d",3);
     System.out.println(list);

     System.out.println(list.set("b",3).toString());
     System.out.println(list);

     list.remove(3);
     System.out.println(list);

  }
}
