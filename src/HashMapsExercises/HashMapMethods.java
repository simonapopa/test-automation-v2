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

        for (int i = 0; i < sizeMap; i++) {
            int x = read.readIntegerNumberFromKey();
            String y = read.readStringFromKey();
            hMap.put(x, y);
        }
        return hMap;
    }

    public HashMap<Integer, String> readHashMap(int sizeMap) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        for (int i = 0; i < sizeMap; i++) {
            int x = read.readIntegerNumberFromKey();
            String y = read.readStringFromKey();
            hMap.put(x, y);
        }
        return hMap;
    }

    public void displayHashMap(HashMap<Integer, String> hashMap) {
        System.out.println("Displaying hash map: ");
        System.out.println(hashMap);
    }
//    public void displayHashMap() {
//        HashMap<Integer, String> hashMap = readHashMap(read.readIntegerNumberFromKey());
//        System.out.println(hashMap);
//    }

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
    public HashMap<Integer, String> clearHashMap(HashMap<Integer, String> hashMap) {
        hashMap.clear();
        return hashMap;
    }

    // Hash maps exercise: Write a Java program to test a hash set is empty or not
    // used isEmpty()
    public boolean isEmptyHashMap(HashMap<Integer, String> hashMap) {
        System.out.println("is empty? ");
        return hashMap.isEmpty();
    }

    // Hash maps exercise: Write a Java program to clone a hash set to another hash set
    public Object cloneAndGetHashSet(HashMap<Integer, String> hashMap) {
        Object newHashMap;
        newHashMap = hashMap.clone();
        return newHashMap;
    }

    // Hash maps exercise: Write a Java program to compare two hash set
    public void compareTwoHashSet(HashMap<Integer, String> firstHashMap, HashMap<Integer, String> secondHashMap) {
        System.out.println("Comparing...");
        for (Entry x : firstHashMap.entrySet()) {
            for (Entry y : secondHashMap.entrySet()) {
                if (x.equals(y))
                    System.out.println("Identical");
                else
                    System.out.println("Different");
            }
        }
    }

    //Hash maps exercise: Write a Java program to remove all of the elements from a hash set
    public HashMap removeAllElements(HashMap<Integer, String> hashMap) {
        Iterator it = hashMap.entrySet().iterator();
        System.out.println("Will remove all elements from hashmap!");
        while (it.hasNext()) {
            Entry mentry = (Entry) it.next();
            it.remove();
        }
        return hashMap;
    }
}
