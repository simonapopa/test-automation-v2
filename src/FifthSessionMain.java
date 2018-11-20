import java.util.Collection;
import java.util.Scanner;

public class FifthSessionMain {
    //collections
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        CollectionsMethods coll = new CollectionsMethods();

        //1 to 100
        int[] array = coll.getArrayToHundred();
        for ( int i = 0; i < array.length; i++ ) {
            //System.out.println(array[i]);
        }

        //average of array
        double average = coll.getAverageFromArray(array);
        //System.out.println(average);

        // Write a Java program to test if an array contains a specific value.
        System.out.println("Please enter number: ");
        int value = scanner.nextInt();

        boolean valoare = coll.getSpecificValue(array, value);

        System.out.println(valoare);

        //Lists

    }
}
