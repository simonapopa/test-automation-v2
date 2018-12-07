package ArraysListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsMain {
    //collections
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        CollectionsMethods coll = new CollectionsMethods();

        // Array exercise: 1. Define and write the values of an array indices, so that the values of the arrays
        //should start from 1 and count to 100; Print the progress in the console;
        int[] array = coll.getArrayToHundred();
        for ( int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }

        //Array exercise: 2.Write a Java program to calculate the average value of array elements.
        //double average = coll.getAverageFromArray(array);
        //System.out.println(average);

        // Array exercise: 3.Write a Java program to test if an array contains a specific value.
        //System.out.print("Please enter a number: ");
        //int value = coll.readIntegerNumberFromKey();
        // boolean valoare = coll.getSpecificValue(array, value);
        // System.out.println(valoare);

        //Array exercise: 4.Write a Java program to find the index of an array element.
//        System.out.print("Please enter a number: ");
//        int value = coll.readIntegerNumberFromKey();
//        int index = coll.getIndexOfArray(array, value);
//        System.out.println("Index of " + value + " is " + index);

        //Array exercise: 5.Write a Java program to remove a specific element from an array.
//        System.out.println("Array:");
//        for ( int i = 0; i < array.length; i++ ) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.print("\n Give number to remove: ");
//        int value = coll.readIntegerNumberFromKey();
//        int[] arrayElement = coll.removeElementFromArray(array,value);
//        for ( int i = 0; i < arrayElement.length; i++ ) {
//            System.out.print(arrayElement[i] + " ");
//        }

        //Array exercise: 6.Write a Java program to find the second smallest element in an array.
//        System.out.println(coll.getSecondSmallestElementFromArray(array));

        // List exercise: Read list from keyboard
//        System.out.print("Give the size of the list: ");
//        int value = coll.readIntegerNumberFromKey();
//        List<Integer> myList = coll.readListFromKey(value);
//        System.out.println("The entered numbers of the list are: " + myList);

        // List exercise: 1. Given a list of numbers, check which one is the highest and print it.
//        coll.getHighestNumberFromList(myList);

//        List<Integer> lista = new ArrayList<Integer>();
//        System.out.println("Give numbers; enter 0 if you wish to stop");
//        int value = 0;
//        while (value != 'q') {
//            value = coll.readIntegerNumberFromKey();
//
//            lista.add(value);
//            if (value == 0)
//                break;
//        }

        // List exercise: 2. Given a list of numbers, determine all of the even ones
        //coll.getEvenFromList();
        //System.out.println("Just the even numbers are: " + coll.getEvenNumbers(myList));

        // List exercise: 3.Write a Java program to iterate through all elements in a loop starting at the specified position
        //coll.getListIterated();

        // List exercise: 4. Write a Java program to sort an array or a list
        //coll.getSortedList();
//        System.out.print("Enter value: ");
//        System.out.println(coll.readFloatNumberFromKey());

    }
}
