package HashMapsExercises;

import ArraysListsExercises.CollectionsMethods;
import ArraysListsExercises.ReadNumbersFromKeyboard;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        HashMapMethods hm = new HashMapMethods();
        CollectionsMethods coll = new CollectionsMethods();
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

        System.out.print("Size list: ");
        HashMap<Integer, String> myhMap = hm.getMaxFromKey(read.readIntegerNumberFromKey());
        System.out.println(myhMap);

        // Hash maps exercise: Write a Java program to iterate through all elements in a hash list
        //hm.getIteratedList(myhMap);

        // Hash maps exercise: Write a Java program to get the number of elements in a hash set
        System.out.print("Number of elements in hash map is " + hm.getNumberOfElementsHashMap(myhMap));
        System.out.println();

        // Hash maps exercise: Write a Java program to empty an hash set
        //myhMap.clear();
        //System.out.println("Emptied map " + myhMap);

        // Hash maps exercise: Write a Java program to test a hash set is empty or not
        System.out.println("Map is empty? " + myhMap.isEmpty());

        // Hash maps exercise: Write a Java program to clone a hash set to another hash set
        //HashMap<Integer, String> newHashMap = (HashMap<Integer, String>) hm.cloneAndGetHashSet(myhMap);
        //System.out.println("Cloned map is " + newHashMap);

        // Hash maps exercise: Write a Java program to compare two hash set
//        System.out.print("Size of second list: ");
//        value = coll.readIntegerNumberFromKey();
//        HashMap<Integer, String> myNewHashMap = hm.getMaxFromKey(value);
//        System.out.println(myNewHashMap);
//        hm.compareTwoHashSet(myhMap, myNewHashMap);

        //Hash maps exercise: Write a Java program to remove all of the elements from a hash set
        hm.removeAllElements(myhMap);
        System.out.println(myhMap);
        System.out.println("Map is empty? " + myhMap.isEmpty());
    }
}
