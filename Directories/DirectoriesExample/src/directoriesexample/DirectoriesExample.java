
package directoriesexample;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Peter
 */
public class DirectoriesExample {

    public static void main(String[] args) {
        
        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        }; // This means we only print out files, not directories.
        
        String[] contents = new File(".").list(filter); // Array containing every file in directory
        for (String file : contents) {
            System.out.println(file); // Without the filter some are files, some are folders.
        }
        
        // Create a directory
        new File("myDirectory").mkdir();
    }
    
}
