
package substitution;

/**
 *
 * @author Peter
 */
public class Building {
    
    public int numberOfRooms = 10;
    
    @Override
    public String toString() {
        return("Building");
    }
    
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
