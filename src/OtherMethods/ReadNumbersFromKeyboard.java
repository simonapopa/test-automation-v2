package OtherMethods;

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
                System.out.print("Give integer: ");
                value = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.print("Not integer. Incorrect value. Try again: ");
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
                System.out.print("Give float: ");
                value = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Not float. Incorrect value. Try again: ");
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
                System.out.print("Give double: ");
                value = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Not double. Incorrect value. Try again: ");
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
                System.out.print("Give long: ");
                value = scanner.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Not long. Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

    //Read STRING number from keyboard
    public String readStringFromKey() {
        String value = "";
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Give string: ");
                value = scanner.next();
                repeat = false;
            } catch (StringIndexOutOfBoundsException e) {
                System.err.print("Not a string. Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

    //Read CHAR number from keyboard
    public char readCharFromKey() {
        char value = ' ';
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Give char: ");
                value = scanner.next().charAt(0);
                repeat = false;
            } catch (InputMismatchException e) {
                System.err.print("Not a char. Incorrect value. Try again: ");
            }
        } while (repeat);
        return value;
    }

    public int readNumberFromKey(String s) {
        System.out.println(s);
        return readIntegerNumberFromKey();
    }

    public double getNumberUncaught() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw e;
        }
    }

    public double getNumberUncaught(String s) throws InputMismatchException {
        System.out.print(s);
        return getNumberUncaught();
    }
}
