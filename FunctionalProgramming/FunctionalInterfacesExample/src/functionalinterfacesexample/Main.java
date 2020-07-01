
package functionalinterfacesexample;

/**
 *
 * @author Peter
 */
public class Main {
    
    // Pass code around as data
    public static void main(String[] args) {
        
        GreetingMessage gm = new GreetingMessage() {
            // Anonymous inner class
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        
        gm.greet("Peter");
    }
}
