package HashMapsExercises;

import ArraysListsExercises.CollectionsMethods;
import ArraysListsExercises.ReadNumbersFromKeyboard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapMethods {
    Scanner scanner = new Scanner(System.in);
    CollectionsMethods coll = new CollectionsMethods();
    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    public HashMap<Integer, String> getMaxFromKey(int sizeMap) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        for ( int i = 0; i < sizeMap; i++ ) {
            System.out.print("Enter the key: ");
            int x = read.readIntegerNumberFromKey();
            System.out.print("Enter the value: ");
            String y = scanner.next();
            hMap.put(x, y);

        }
        return hMap;
    }

    // Hash maps exercise: Write a Java program to iterate through all elements in a hash list
    public void getIteratedList(HashMap<Integer, String> hMap) {
        Iterator it = hMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry mentry = (Entry) it.next();
            System.out.print("Key is " + mentry.getKey() + " & value is: " + mentry.getValue());
        }
    }

    // Hash maps exercise: Write a Java program to get the number of elements in a hash set
    public int getNumberOfElementsHashMap(HashMap<Integer, String> hMap) {
        Iterator it = hMap.entrySet().iterator();

        int count = 0;
        while (it.hasNext()) {
            Entry mentry = (Entry) it.next();
            count++;
        }
        return count;
    }

    // Hash maps exercise: Write a Java program to empty an hash set
    //used clear()

    // Hash maps exercise: Write a Java program to test a hash set is empty or not
    // used isEmpty()

    // Hash maps exercise: Write a Java program to clone a hash set to another hash set
    public Object cloneAndGetHashSet(HashMap<Integer, String> hashMap) {
        Object newHashMap = new HashMap<Integer, String>();
        newHashMap = hashMap.clone();
        return newHashMap;
    }

    // Hash maps exercise: Write a Java program to compare two hash set
    public void compareTwoHashSet(HashMap<Integer, String> firstHashMap, HashMap<Integer, String> secondHashMap) {
        for ( Entry x : firstHashMap.entrySet() ) {
            for ( Entry y : secondHashMap.entrySet() ) {
                if (x.equals(y))
                    System.out.println("Identical");
                else
                    System.out.println("Different");
            }
        }
    }

    //Hash maps exercise: Write a Java program to remove all of the elements from a hash set
    public void removeAllElements(HashMap<Integer, String> hashMap) {
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry mentry = (Entry) it.next();
            it.remove();
        }
    }
}
