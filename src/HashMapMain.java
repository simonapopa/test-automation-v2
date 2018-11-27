import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        HashMapMethods hm = new HashMapMethods();

        System.out.print("Size list: ");
        int value = scanner.nextInt();

        HashMap<Integer, String> myhMap = hm.getMaxFromKey(value);
        System.out.println(myhMap);

        // Write a Java program to iterate through all elements in a hash list
        hm.getIteratedList(myhMap);


    }
}
