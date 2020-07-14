
package runnableinterfaceexample;

/**
 *
 * @author Peter
 */
public class RunnableExample implements Runnable {
    
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i + " going up " + Thread.currentThread().getName());
            i++;
        }
    }
}
