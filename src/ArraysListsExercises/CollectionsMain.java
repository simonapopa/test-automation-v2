package ArraysListsExercises;

import OtherMethods.ReadNumbersFromKeyboard;

public class CollectionsMain {
    //collections
    public static void main(String args[]) {
        CollectionsMethods coll = new CollectionsMethods();
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

        // Read an array and show it from keyboard
//        coll.displayArrayReadFromKey(coll.readArrayFromKey(read.readIntegerNumberFromKey()));
//        coll.displayArrayReadFromKey(coll.readArrayFromKey(read.readDoubleNumberFromKey()));

        // Array exercise: 1. Define and write the values of an array indices, so that the values of the arrays
        //should start from 1 and count to 100; Print the progress in the console;
//        coll.displayArrayReadFromKey(coll.getArrayToHundred());

        //Array exercise: 2.Write a Java program to calculate the average value of array elements.
//        System.out.println(coll.getAverageFromArray(coll.readArrayFromKey(read.readDoubleNumberFromKey())));

        // Array exercise: 3.Write a Java program to test if an array contains a specific value.
//        System.out.println(coll.getSpecificValue(coll.readArrayFromKey(read.readIntegerNumberFromKey()),read.readIntegerNumberFromKey()));

        //Array exercise: 4.Write a Java program to find the index of an array element.
//        System.out.println("Index is " + coll.getIndexOfArray(coll.readArrayFromKey(read.readIntegerNumberFromKey())));

        //Array exercise: 5.Write a Java program to remove a specific element from an array.
//        System.out.println("Array:");
//        coll.displayArrayReadFromKey(coll.removeElementFromArray(coll.readArrayFromKey(read.readIntegerNumberFromKey())));

        //Array exercise: 6.Write a Java program to find the second smallest element in an array.
//        System.out.println(coll.getSecondSmallestElementFromArray(coll.readArrayFromKey(read.readIntegerNumberFromKey())));

        // List exercise: Read list from keyboard
//        System.out.println(coll.readListFromKey(read.readIntegerNumberFromKey()));

        // List exercise: 1. Given a list of numbers, check which one is the highest and print it.
//        System.out.println(coll.getHighestNumberFromList(coll.readListFromKey(read.readIntegerNumberFromKey())));

        // List exercise: 2. Given a list of numbers, determine all of the even ones
//        System.out.println(coll.getEvenNumbers(coll.readListFromKey(read.readIntegerNumberFromKey())));

        //List exercise: Remove odd numbers
//        System.out.println(coll.removeOddNumbers(coll.readListFromKey(read.readIntegerNumberFromKey())));

        // List exercise: 3.Write a Java program to iterate through all elements in a loop starting at the specified position
//        coll.getListIterated(coll.readListFromKey(read.readIntegerNumberFromKey()));

        // List exercise: 4. Write a Java program to sort an array or a list
        System.out.println(coll.getSortedList(coll.readListFromKey(read.readIntegerNumberFromKey())));
    }
}