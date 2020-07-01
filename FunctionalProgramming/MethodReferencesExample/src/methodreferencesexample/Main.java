
package methodreferencesexample;

/**
 *
 * @author Peter
 */
public class Main {
    
    public static void main(String[] args) {
        Square s = new Square(4);
        
        // Lambda
        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };
        
        System.out.println("Area: " + shapes.getArea(s));
        
        // Method reference. Don't need to put the brackets after the method
        Shapes shapes2 = Square::calculateArea;
        System.out.println("Area: " + shapes2.getArea(s));
        
    }
}
