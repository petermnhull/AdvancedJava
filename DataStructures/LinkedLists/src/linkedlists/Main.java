
package linkedlists;

import java.util.LinkedList;

/**
 *
 * @author Peter
 */
public class Main {
    
    public static void main(String[] args) {
        // Take up more memory than array lists
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("C");
        System.out.println(myList);
        
        myList.add(1, "B");
        System.out.println(myList);
        
        myList.remove("B"); // can also go by index
        System.out.println(myList);
    }
}
