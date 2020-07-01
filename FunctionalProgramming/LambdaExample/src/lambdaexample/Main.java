
package lambdaexample;

/**
 *
 * @author Peter
 */
public class Main {
    // Lambdas are a way of implementing functional interfaces.
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            // Anonymous inner class
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Peter");
        
        // Using lambda
        // Don't have to rewrite the whole method
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        
        gm2.greet("Peter");
        
        MessagePrinter mp = () -> {
            System.out.println("This is a message.");
        };
        
        mp.printMessage();
    }
}
