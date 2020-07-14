
package trywithresourcesexample;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.StringWriter;
import java.io.StringReader;

/**
 *
 * @author Peter
 */
public class TryWithResourcesExample {


    public static void main(String[] args) {
        
        // Try with resources
        try (BufferedReader reader = new BufferedReader(new StringReader("Hello world!"));
                StringWriter writer = new StringWriter();
                ) {
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException ioe) {
            // Do nothing
        }
        
        // If you can use try with resources, you should! As it prevents resource leaking.
    }
    
}
