
package employees;

import java.util.ArrayList;

/**
 *
 * @author Peter
 */
public class Hairdresser {
    
    private String name;
    private ArrayList<String> daysAvailable = new ArrayList<>();
    
    public Hairdresser(String name) {
        this.name = name;
    }
    
    public void setDaysAvailable(String... days) {
        for (String day : days) {
            daysAvailable.add(day);
        }
    }
    
    public ArrayList<String> getDaysAvailable() {
        return daysAvailable;
    }
    
    public void removeDay(String day) {
        if (daysAvailable.contains(day)) {
            daysAvailable.remove(day);
        }
    }
    
    public String getName() {
        return name;
    }
}
