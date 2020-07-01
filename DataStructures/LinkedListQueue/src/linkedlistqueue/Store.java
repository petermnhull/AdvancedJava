
package linkedlistqueue;

import java.util.LinkedList;

/**
 *
 * @author Peter
 */
public class Store {
    
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList();
        // add elements to end of list
        queue.add(new Customer("Peter"));
        queue.add(new Customer("Fred"));
        queue.add(new Customer("Manlin"));
        System.out.println(queue);
        
        for (int i = 0; i < 3; i++){
            serveCustomer(queue);
            System.out.println(queue);
        }
    }
    
    static void serveCustomer(LinkedList<Customer> queue) {
        // poll.() method returns first customer and removes them
        Customer c = queue.poll();
        c.serve();
    }
}
