
package filecopyexample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


/**
 *
 * @author Peter
 */
public class FileCopyExample {


    public static void main(String[] args) {
        // Create new file and copy contents of other file
        
        Path source = Paths.get("C:\\Users\\Peter\\Documents\\myFile.txt");
        Path dest = Paths.get("C:\\Users\\Peter\\Documents\\new.txt");
        
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    
}
