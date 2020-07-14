
package threadclassexample;

/**
 *
 * @author Peter
 */
public class Main {


    public static void main(String[] args) {
    
        // Everytime a java program runs, it runs at least one thread.
        System.out.println(Thread.activeCount()); // Shows that one thread is running
        
        // Set up a thread in a waiting state
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My first thread");
        thread1.start(); // Thread is now alive
        
        // Set up a thread in a waiting state
        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My second thread");
        thread2.start(); // Thread is now alive
        
        
        // Both the above methods are doing things at the same time!
    }
    
}
