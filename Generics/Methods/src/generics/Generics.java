/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Peter
 */
public class Generics {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};
    
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }
    
    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<> ());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<> ());
        List<Integer> intList = arrayToList(intArray, new ArrayList<> ());
        
        System.out.println(intList.get(0));
    }
    
}