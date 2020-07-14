
package threadclassexample;

/**
 *
 * @author Peter
 */
public class ThreadExample extends Thread {
    
    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            // Print name of current thread
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}
