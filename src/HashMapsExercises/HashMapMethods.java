package HashMapsExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapMethods {
    Scanner scanner = new Scanner(System.in);

    public HashMap<Integer, String> getMaxFromKey(int sizeMap) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        for ( int i = 0; i < sizeMap; i++ ) {
            System.out.print("Enter the key: ");
            int x = scanner.nextInt();
            System.out.print("Enter the value: ");
            String y = scanner.next();
            hMap.put(x, y);

        }
        return hMap;
    }

    // Write a Java program to iterate through all elements in a hash list
    public void getIteratedList(HashMap<Integer, String> hMap) {
        Iterator it = hMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry mentry = (Map.Entry) it.next();
            System.out.print("Key is " + mentry.getKey() + " & value is: " + mentry.getValue());
        }
    }


}
