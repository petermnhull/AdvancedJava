
package linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Peter
 */
public class LinkedHashMapExample {

    public static void main(String[] args) {
        // specify initial capacity, load factor, and whether we preserve the order.
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, true);
        // When it's 75% full, map gets bigger.
        // If true, then it prints out in order of most recently accessed keys.
        phonebook.put("Ben", 123123);
        phonebook.put("Bob", 111100);
        phonebook.put("Beb", 111102);
        phonebook.put("Amy", 111111);
        
        System.out.println("Amy's Number: " + phonebook.get("Amy"));
        
        System.out.println("\n List of contacts in phonebook:");
        for (Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
