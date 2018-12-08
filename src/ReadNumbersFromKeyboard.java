import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumbersFromKeyboard {

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

    public int readNumberFromKey(String s) {
        System.out.println(s);
        return readIntegerNumberFromKey();
    }

}
