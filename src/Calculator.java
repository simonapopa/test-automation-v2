import java.util.Scanner;

import static java.lang.System.in;

public class Calculator {

    // move all operational methods here


    // adunare
    public static long adunare(long firstNumber, long secondNumber) {
        long result = firstNumber + secondNumber;
        return result;
    }

    //scadere
    public static long scadere(long firstNumber, long secondNumber) {
        long result = firstNumber - secondNumber;
        return result;
    }

    //inmultire
    public static long inmultire(long firstNumber, long secondNumber) {
        long result = firstNumber * secondNumber;
        return result;
    }

    //impartire
    public static float impartire(float firstNumber, float secondNumber) {
        float result = firstNumber / secondNumber;
        return result;
    }

    public static void secondExercise() {
        Scanner scanner = new Scanner(in);

        System.out.print("define a byte value:");
        byte myByte = scanner.nextByte();

        System.out.print("define a short value:");
        short myShort = scanner.nextShort();

        System.out.print("define an int value:");
        int myInt = scanner.nextInt();

        System.out.print("define a long value:");
        long myLong = scanner.nextLong();

        System.out.print("define a float value:");
        float myFloat = scanner.nextFloat();

        System.out.print("define a double value:");
        double myDouble = scanner.nextDouble();
        boolean myBoolean = true;
        String myString = "test";


        //long result = myInt + myLong;

        System.out.println(myString + (myByte + myShort + myInt + myLong + myFloat + myDouble) + myBoolean);
        System.out.println(myString + (myByte - myShort - myInt - myLong - myFloat - myDouble) + myBoolean);
        System.out.println(myString + (myByte * myShort * myInt * myLong * myFloat * myDouble) + myBoolean);
        System.out.println(myString + (myByte / myShort / myInt / myLong / myFloat / myDouble) + myBoolean);
    }

    // 3. Write a Java program to divide two numbers and print on the screen.
    public static void thirdExercise(long first, long second) {
        System.out.println("Sum is = " + (first + second));
    }

    // 5. Write a Java program that takes two numbers as input and display the product of two numbers.
    public static void fifthExercise(long first, long second) {
        System.out.print(first + "x" + second + "=" + first * second);
    }

    // 8. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static float seventhExercise(long first, long second, long third) {
        return (float) (first + second + third) / (3);
    }
}
