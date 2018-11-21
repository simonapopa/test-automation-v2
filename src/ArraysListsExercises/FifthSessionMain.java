package ArraysListsExercises;

import ArraysListsExercises.CollectionsMethods;

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
        double average = coll.getAverageFromArray(array);
        //System.out.println(average);

        // Array exercise: 3.Write a Java program to test if an array contains a specific value.
        System.out.println("Please enter number: ");
        int value = scanner.nextInt();
        boolean valoare = coll.getSpecificValue(array, value);
        System.out.println(valoare);

        //Array exercise: 4.Write a Java program to find the index of an array element.



    }
}
