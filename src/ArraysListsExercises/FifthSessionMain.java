package ArraysListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FifthSessionMain {
    //collections
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        CollectionsMethods coll = new CollectionsMethods();

        // Array exercise: 1. Define and write the values of an array indices, so that the values of the arrays
        //should start from 1 and count to 100; Print the progress in the console;
        int[] array = coll.getArrayToHundred();
        for ( int i = 0; i < array.length; i++ ) {
            //System.out.println(array[i]);
        }

        //Array exercise: 2.Write a Java program to calculate the average value of array elements.
        //double average = coll.getAverageFromArray(array);
        //System.out.println(average);

        // Array exercise: 3.Write a Java program to test if an array contains a specific value.
        //System.out.print("Please enter a number: ");
        //int value = scanner.nextInt();
        // boolean valoare = coll.getSpecificValue(array, value);
        // System.out.println(valoare);

        //Array exercise: 4.Write a Java program to find the index of an array element.
       /* System.out.print("Please enter a number: ");
        int value = scanner.nextInt();
        int index = coll.getIndexOfArray(value);
        int index = coll.getIndexOfArrayTwo(array, value);
        System.out.println("Index of " + value + " is " + index);*/

        //Array exercise: 5.Write a Java program to remove a specific element from an array.
        /*System.out.println("Array:");
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n Give number to remove: ");
        int value = scanner.nextInt();
        int[] arrayElement = coll.removeElementFromArray(value);
        for ( int i = 0; i < arrayElement.length; i++ ) {
            System.out.print(arrayElement[i] + " ");
        }*/

        //Array exercise: 6.Write a Java program to find the second smallest element in an array.
        // int smallest = coll.getSecondSmallestElementFromArray();
        //int smallest = coll.getSecondSmallestElementFromArrayTwo();
        //coll.getSecondSmallestElementFromArray();

        // List exercise: 1. Given a list of numbers, check which one is the highest and print it.
        //coll.getHighestNumberFromList();

       /* List<Integer> lista = new ArrayList<Integer>();
        System.out.println("Give numbers; press 'q' if you wish to stop");
        int value = scanner.nextInt();
        for(int i = 0; i< lista.size();i++){
            lista.add(value);
        }
        coll.getHighestNumberFromListTwo(lista);*/
    }
}
