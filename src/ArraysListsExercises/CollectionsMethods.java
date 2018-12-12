package ArraysListsExercises;
import OtherMethods.ReadNumbersFromKeyboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class CollectionsMethods {
    // Array exercise: 1. Define and write the values of an array indices, so that the values of the arrays
    //should start from 1 and count to 100; Print the progress in the console;

    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    //Array: Read integer array
    public int[] readArrayFromKey(int sizeArray) {
        int[] myArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            myArray[i] = read.readIntegerNumberFromKey();
        }
        return myArray;
    }

    //Array: Read double size of array
    public double[] readArrayFromKey(double sizeArray) {
        double[] myArray;
        myArray = new double[(int) sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            myArray[i] = read.readDoubleNumberFromKey();
        }
        return myArray;
    }

    //Array: Display array content
    public void displayArrayReadFromKey(int[] myArray) {
        System.out.println("Array looks like this: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    public void displayArrayReadFromKey(double[] myArray) {
        System.out.println("Array looks like this: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    //Array: Read array to 100
    public int[] getArrayToHundred() {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i;
        }
        return myArray;
    }

    //Array exercise: 2.Write a Java program to calculate the average value of array elements.
    public double getAverageFromArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Array exercise: 3.Write a Java program to test if an array contains a specific value.
    public boolean getSpecificValue(int[] array) {
        System.out.println("Define specific value to search in array.");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i] == read.readIntegerNumberFromKey()) {
                return true;
            }
        }
        return false;
    }

    //Array exercise: 4.Write a Java program to find the index of an array element.
    public int getIndexOfArray(int[] array) {
        System.out.println("Which index do you want to find?");
        int value = read.readIntegerNumberFromKey();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }

    //Array exercise: 5.Write a Java program to remove a specific element from an array.
    public int[] removeElementFromArray(int[] array) {
        int[] clonedArray = array.clone();
        System.out.println("Give number to remove: ");
        int value = read.readIntegerNumberFromKey();
        for (int i = 0; i < clonedArray.length; i++) {
            if (clonedArray[i] == value) {
                clonedArray[i] = 0;
            }
        }
        return clonedArray;
    }

    //Array exercise: 6.Write a Java program to find the second smallest element in an array.
    public int getSecondSmallestElementFromArray(int[] array) {
        int small, smallest;
        small = array[0];
        smallest = array[1];

        for (int i = 0; i < array.length; i++) {

            if (small > array[i]) {
                smallest = small;
                small = array[i];
            } else if (smallest > array[i] && small != array[i])
                smallest = array[i];
        }
        System.out.println("First small number from array is " + small + " and second smallest is ");
        return smallest;
    }

    // List exercise: Read list from keyboard
    public List<Integer> readListFromKey(int sizeList) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < sizeList; i++) {
            myList.add(read.readIntegerNumberFromKey());
        }
        System.out.println("Entered list is: ");
        return myList;
    }

    // List exercise: 1. Given a list of numbers, check which one is the highest and print it.
    public int getHighestNumberFromList(List<Integer> myList) {
        int max = myList.get(0);

        for (int i = 0; i < myList.size(); i++) {
            if (max < myList.get(i))
                max = myList.get(i);
        }
        return max;
    }

    // List exercise: 2. Given a list of numbers, determine all of the even ones
    public void getEvenFromList(List<Integer> list) {
        int even = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even = list.get(i);
                System.out.println(even + " even");
            }
        }
    }

    public List<Integer> getEvenNumbers(List<Integer> myList) {

        List<Integer> myEvenList = new ArrayList<Integer>();
        for (Integer x : myList) {
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
    public void getListIterated(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("An element in the list: " + it.next());
        }
    }

    // List exercise: 4. Write a Java program to sort an array or a list
    public List<Integer> getSortedList(List<Integer> list) {
        List<Integer> aux = new ArrayList<>(list);
        System.out.println("Unsorted list: " + list);
        aux.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: ");
        return aux;
    }
}