/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author Peter
 */
public class VarArgs {
    
    public static void main(String[] args) {
        printShoppingList("Bananas", "Nuts", "Porridge");
    }
    
    private static void printShoppingList(String... items) {
        System.out.println("Shopping List");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println("");
    }
}
