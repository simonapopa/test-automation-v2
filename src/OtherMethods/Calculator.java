package OtherMethods;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Calculator {

    ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

    // adunare
    public long adunare(long firstNumber, long secondNumber) {
        long result = firstNumber + secondNumber;
        return result;
    }

    //adunare finisat
    public double adunare() {
        double sum = 0;
        boolean flag = true;
        do {
            try {
                sum = sum + read.getNumberUncaught("Introduceti un numar pentru adunare sau caracter pentru iesire = ");
                System.out.println("Sum = " + sum);
            } catch (InputMismatchException e) {
                flag = false;
            }
        } while (flag);

        return sum;
    }

    //scadere
    public long scadere(long firstNumber, long secondNumber) {
        long result = firstNumber - secondNumber;
        return result;
    }

    //inmultire
    public long inmultire(long firstNumber, long secondNumber) {
        long result = firstNumber * secondNumber;
        return result;
    }

    //impartire
    public float impartire(float firstNumber, float secondNumber) {
        float result = firstNumber / secondNumber;
        return result;
    }

    public void secondExercise() {
        Scanner scanner = new Scanner(in);

        System.out.print("define a byte value:");
        byte myByte = scanner.nextByte();

        System.out.print("define a short value:");
        short myShort = scanner.nextShort();

        System.out.print("define an int value:");
        int myInt = read.readIntegerNumberFromKey();

        System.out.print("define a long value:");
        long myLong = read.readLongNumberFromKey();

        System.out.print("define a float value:");
        float myFloat = read.readFloatNumberFromKey();

        System.out.print("define a double value:");
        double myDouble = read.readDoubleNumberFromKey();
        boolean myBoolean = true;
        String myString = "UnitTests";
        //long result = myInt + myLong;

        System.out.println(myString + (myByte + myShort + myInt + myLong + myFloat + myDouble) + myBoolean);
        System.out.println(myString + (myByte - myShort - myInt - myLong - myFloat - myDouble) + myBoolean);
        System.out.println(myString + (myByte * myShort * myInt * myLong * myFloat * myDouble) + myBoolean);
        System.out.println(myString + (myByte / myShort / myInt / myLong / myFloat / myDouble) + myBoolean);
    }

    // 3. Write a Java program to divide two numbers and print on the screen.
    public void getNumbers(long first, long second) {
        System.out.println("Division is = " + (first / second));
    }

    // 5. Write a Java program that takes two numbers as input and display the product of two numbers.
    public float getNumbersProduct(float first, float second) {
        return first * second;
    }

    // 8. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public float getNumbers(long first, long second, long third) {
        return (float) (first + second + third) / (3);
    }

    // 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
    public String getYourName(String name) {
        //System.out.println("Give a name: ");
        return name;
    }

    /* 4. Write a Java program to print the result of the following operations:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        */
    public void forthExercise() {
        int a, b, c, sumInt = 0;
        float sumFloat;
        a = -5;
        b = 8;
        c = 6;

        System.out.println("Result f        sumInt = a + b * c;\nor 'a. -5 + 8 * 6' is " + sumInt);

        a = 55;
        b = 9;
        c = 9;

        sumFloat = (a + b) % c;
        System.out.println("Result for 'b. (55+9) % 9' is " + sumFloat);

        a = 20;
        b = 3;
        c = 5;

        sumInt = a + (-3 * 5) / 8;
        System.out.println("Result for 'c. 20 + -3*5 / 8' is " + sumInt);

        a = 5;
        b = 15;
        c = 8;

        sumFloat = a + b / 3 * 2 - c % 3;
        System.out.println("Result for 'd. 5 + 15 / 3 * 2 - 8 % 3' is " + sumFloat);

    }

    // 6. Write a Java program to display the following pattern
    public void getYourName() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    // 9. Write a Java program to display the following pattern
    public void printFacePattern() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    // 10.Write a Java program to convert temperature from Fahrenheit to Celsius degree, using this formula: C = 5/9 * (F-32)
    public float nineExercise(float temp) {
        return (5f / 9 * (temp - 32));
    }

    // 11.Write a Java program that reads a number in inches, converts it to meters. ( one inch is 0.0254 meters)
    public double tenthExercise(double number) {
        return number * 0.0254;
    }

    // 12.Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes,
    //seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)
    public float eleventhExercise(int hour, int minute, int second) {
        return (hour * 3600) + (minute * 60) + second;
    }
}