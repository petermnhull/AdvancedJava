
package synchronisationexample;

/**
 *
 * @author Peter
 */
public class ATM {
    
    // add synchronized so that only one thread can be in the method at a time.
    public static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if ((balance - amount) < - account.getOverdraft()) {
            System.out.println("Transaction denied.");
        } else {
            account.debit(amount);
            System.out.println("£" + amount + " successfully withdrawn.");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
