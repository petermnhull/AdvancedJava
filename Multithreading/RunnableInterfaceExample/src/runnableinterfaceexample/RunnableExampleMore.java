
package runnableinterfaceexample;

/**
 *
 * @author Peter
 */
public class RunnableExampleMore implements Runnable {
    
    @Override
    public void run() {
        int i = 0;
        while (i > -100) {
            System.out.println(i + " going down " + Thread.currentThread().getName());
            i--;
        }
    }
}
