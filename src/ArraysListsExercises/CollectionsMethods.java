package ArraysListsExercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
    public int getHighestNumberFromList() {
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
        return max;
    }

    // List exercise: 2. Given a list of numbers, determine all of the even ones
    public void getEvenFromList() {
        List<Integer> list = new ArrayList<Integer>();
        int even = 0;

        list.add(4);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println("List is " + list);
        for ( int i = 0; i < list.size(); i++ ) {

            if (list.get(i) % 2 == 0) {
                even = list.get(i);
                System.out.println(even + " even");
            }
        }
    }

    public List<Integer> getEvenNumbers(List<Integer> myList) {

        List<Integer> myEvenList = new ArrayList<Integer>();
        for ( Integer x : myList ) {
            if (x % 2 == 0) {
                myEvenList.add(x);
            }
        }
        return myEvenList;
    }

    // List exercise: Remove odd numbers from list
    public List<Integer> removeOddNumbers(List<Integer> myList) {

        int count = 0;
        while (count < myList.size()) {
            if (myList.get(count) % 2 != 0) {
                myList.remove(count);
            } else count++;
        }
        return myList;
    }

    // List exercise: 3.Write a Java program to iterate through all elements in a loop starting at the specified position
    public void getListIterated() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);

        for ( int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i));
        }
    }

    // List exercise: 4. Write a Java program to sort an array or a list
    public void getSortedList() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);

        List<Integer> aux = new ArrayList<Integer>();
        System.out.println("Unsorted list: " + list);

        for ( int i = 0; i < list.size(); i++ ) {

            if (list.get(0) > list.get(i)) {
                aux.add(i);
            }

        }
        System.out.println("Sorted list: " + aux);
    }

    // List exercise: Read list from keyboard
    public List readListFromKey(int sizeList) {
        List<Integer> myList = new ArrayList<Integer>();
        for ( int i = 0; i < sizeList; i++ ) {
            myList.add(readIntegerNumberFromKey());
        }
        return myList;
    }

    //Read INTEGER number from keyboard
    public int readIntegerNumberFromKey() {
        int value = 0;
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.print("Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

    //Read FLOAT number from keyboard
    public float readFloatNumberFromKey() {
        float value = 0;
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

    //Read DOUBLE number from keyboard
    public double readDoubleNumberFromKey() {
        double value = 0.0;
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

    //Read LONG number from keyboard
    public long readLongNumberFromKey() {
        long value = 0;
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

}

