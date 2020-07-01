
package HashMapExample;

import java.util.HashMap;

/**
 *
 * @author Peter
 */
public class Main {

    public static void main(String[] args) {
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Amy", 111111);
        phonebook.put("Ben", 123123);
        phonebook.put("Bob", 111100);
        
        System.out.println(phonebook);
        
        // Hashmaps unordered
        // No duplicate keys allowed, so can't accidentally have multiple entries with same key
        phonebook.put("Bob", 222);
        System.out.println(phonebook);
        
        // Null keys
        phonebook.put(null, 111);
        System.out.println(phonebook);
        
        // Conditionally remove entries
        if (phonebook.containsKey("Bob")) {
            phonebook.remove("Bob");
        }
        System.out.println(phonebook);
        
        // Clear
        phonebook.clear();
        System.out.println(phonebook);
    }
    
}
