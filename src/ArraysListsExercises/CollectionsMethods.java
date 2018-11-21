package ArraysListsExercises;

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
        int small = 0, smallest = 0;
        int[] array = {3, 5, 2, 6, 1, 4, 10};

        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 1; j < array.length; j++ ) {
                if (array[i] < array[j-1])
                    small = array[i];
                else
                    small = array[j-1];

                if (small < array[j-1])
                    smallest = small;

                System.out.println("Comparing " + smallest + " " + small);
            }
        }
        System.out.println("Smallest from an array is " + smallest + " " + small);

    }


    public int getSecondSmallestElementFromArrayTwo() {
        int small = 0, smallest;
        int[] array = new int[10];
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = i;

            if (array[i] < array[i + 1])
                small = array[i];
        }
        return small;
    }

}

