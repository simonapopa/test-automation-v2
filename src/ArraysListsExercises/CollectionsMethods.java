package ArraysListsExercises;

public class CollectionsMethods {

    // Array exercise: 1. Define and write the values of an array indices, so that the values of the arrays
    //should start from 1 and count to 100; Print the progress in the console;
    public int[] getArrayToHundred() {
        int[] myArray = new int[100];
        for ( int i = 1; i <= 100; i++ ) {
            myArray[i - 1] = i;
        }
        System.out.println("I was here.");
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

}
