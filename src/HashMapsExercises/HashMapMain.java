package HashMapsExercises;

import ArraysListsExercises.CollectionsMethods;
import ArraysListsExercises.ReadNumbersFromKeyboard;

public class HashMapMain {

    public static void main(String args[]) {
        HashMapMethods hm = new HashMapMethods();
        CollectionsMethods coll = new CollectionsMethods();
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

//        HashMap<Integer, String> myhMap = hm.getMaxFromKey(read.readIntegerNumberFromKey());
//        System.out.println(myhMap);

        // Hash maps exercise: Write a Java program to iterate through all elements in a hash list
//        hm.getIteratedList(hm.readHashMap(read.readIntegerNumberFromKey()));

        // Hash maps exercise: Write a Java program to get the number of elements in a hash set
//        System.out.print("Number of elements in hash map is " + hm.getNumberOfElementsHashMap(hm.readHashMap(read.readIntegerNumberFromKey())) + "\n");

        // Hash maps exercise: Write a Java program to empty an hash set
//        System.out.println("Emptied map " + hm.clearHashMap(hm.readHashMap(read.readIntegerNumberFromKey())));

        // Hash maps exercise: Write a Java program to test a hash set is empty or not
//        System.out.println("Map is empty? " + myhMap.isEmpty());

        // Hash maps exercise: Write a Java program to clone a hash set to another hash set
//        System.out.println("Cloned map is " + hm.cloneAndGetHashSet(hm.readHashMap(read.readIntegerNumberFromKey())));

        // Hash maps exercise: Write a Java program to compare two hash set
//        hm.compareTwoHashSet(hm.readHashMap(read.readIntegerNumberFromKey()), hm.getMaxFromKey(read.readIntegerNumberFromKey()));

        //Hash maps exercise: Write a Java program to remove all of the elements from a hash set
        hm.displayHashMap(hm.readHashMap(read.readIntegerNumberFromKey()));
        hm.removeAllElements(hm.readHashMap(read.readIntegerNumberFromKey()));
//        System.out.println("Map is empty? " + hm.isEmptyHashMap());
    }
}
