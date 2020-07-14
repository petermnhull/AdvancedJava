
package scannerexample;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name, age and phone number: ");
        String name = scanner.next();
        int age = scanner.nextInt();
        long phoneNumber = scanner.nextLong();
        
        Person person = new Person(name, age, phoneNumber);
        
    }
}
