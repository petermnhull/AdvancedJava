
package filecreationexample;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Peter
 */
public class FileCreationExample {


    public static void main(String[] args) {
        
        File myFile = new File("C:\\Users\\Peter\\Documents\\myFile.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated); // Returns file if file already exists.
        } catch (IOException ioe) {
            // Do nothing.
        }
                
    }
    
}
