
package runnableinterfaceexample;

/**
 *
 * @author Peter
 */
public class Main {


    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new RunnableExampleMore());
        thread1.start();
        
        Thread thread2 = new Thread(new RunnableExample());
        
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }
            }
        });  
        
        thread2.start();
        
        // Replace above with a lambda
        Thread thread4 = new Thread(() -> {
           int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            } 
        });
        
        thread3.start();
    }
}
