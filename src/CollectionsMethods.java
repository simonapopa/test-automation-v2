public class CollectionsMethods {

    // 1 to 100
    public int[] getArrayToHundred() {
        int[] myArray = new int[100];
        for ( int i = 1; i <= 100; i++ ) {
            myArray[i - 1] = i;
        }
        System.out.println("I was here.");
        return myArray;

    }    //average of array

    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for ( int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Write a Java program to test if an array contains a specific value.

    public boolean getSpecificValue(int[] array, int value) {


        for ( int i = 0; i < array.length; i++ ) {
            array[i] = i;

            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }
}
