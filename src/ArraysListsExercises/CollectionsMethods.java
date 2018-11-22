package ArraysListsExercises;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMethods {

    // Array exercise: 1. Define and write the values of an array indices, so that the values of the arrays
    //should start from 1 and count to 100; Print the progress in the console;
    public int[] getArrayToHundred() {
        int[] myArray = new int[101];
        for ( int i = 0; i < 101; i++ ) {
            myArray[i] = i;
        }
        //System.out.println("I was here.");
        return myArray;

    }

    //Array exercise: 2.Write a Java program to calculate the average value of array elements.
    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for ( int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Array exercise: 3.Write a Java program to test if an array contains a specific value.
    public boolean getSpecificValue(int[] array, int value) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = i;
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    //Array exercise: 4.Write a Java program to find the index of an array element.
    public int getIndexOfArray(int value) {
        int[] array = {1, 3, 5, 10, 12, 2};
        for ( int i = 0; i < array.length; i++ ) {

            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }

    public int getIndexOfArrayTwo(int[] array, int value) {
        for ( int i = 1; i < array.length; i++ ) {
            if (array[i - 1] == value) {
                return i - 1;
            }
        }
        return 0;
    }

    //Array exercise: 5.Write a Java program to remove a specific element from an array.
    public int[] removeElementFromArray(int value) {
        int[] array = new int[101];
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = i;
            if (array[i] == value) {
                array[i] = 0;
            }
        }
        return array;
    }

    //Array exercise: 6.Write a Java program to find the second smallest element in an array.
    public void getSecondSmallestElementFromArray() {
        int small, smallest;
        int[] array = {3, 5, 10, 6, 1, 4, 10, 1, 1, 4};
        small = array[0];
        smallest = array[1];

        for ( int i = 0; i < array.length; i++ ) {

            if (small > array[i]) {
                smallest = small;
                small = array[i];
            } else if (smallest > array[i] && small != array[i])
                smallest = array[i];
        }
        System.out.println("First small number from array is " + small + " and second smallest is " + smallest);
    }

    // List exercise: 1. Given a list of numbers, check which one is the highest and print it.
    public void getHighestNumberFromList() {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(1);
        myList.add(1);
        myList.add(3);
        myList.add(2);

        int max = myList.get(0);

        for ( int i = 0; i < myList.size(); i++ ) {
            if (max < myList.get(i))
                max = myList.get(i);
        }
        System.out.println("Max of list " + myList + " is " + max);
    }

    public List<Integer> getHighestNumberFromListTwo(List<Integer> myList) {

        for ( int i = 0; i < myList.size(); i++ ) {
            myList.add(i);
        }

        return myList;
    }


}

