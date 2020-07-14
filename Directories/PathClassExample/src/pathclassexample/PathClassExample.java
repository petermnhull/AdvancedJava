
package pathclassexample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 *
 * @author Peter
 */
public class PathClassExample {


    public static void main(String[] args) {
        // Check if file exists and delete it if it does.
        Path path = Paths.get("Hello World");
        try {
            Files.deleteIfExists(path);
        } catch (IOException ioe) {
            // do nothing
        }
        
        Path path2 = Paths.get("C:\\Users\\Peter\\Documents\\example.txt");
        System.out.println(path2.getParent()); // Get parent directory (...\Documents)
        System.out.println(path2.getRoot()); // Get root directory (C:\)
        System.out.println(path2.getFileName()); // Get file name (example.txt)
        
    }
    
}
