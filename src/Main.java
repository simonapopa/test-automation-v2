import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(in);
        /*
        System.out.println("Enter your name:");
        String nume = scanner.next();
        System.out.println("Hello world!" + "\n" + firstExercise(nume));
        */
        //forthExercise();
        //sixthExercise();
        //eightExercise();
        //eleventhExercise();

        System.out.print("Give first number:");
        long number1 = scanner.nextLong();
        System.out.print("Give second number:");
        long number2 = scanner.nextLong();
        System.out.print("Give third number:");
        long number3 = scanner.nextLong();
        System.out.print("Give Fahrenheit:");
        float f = scanner.nextInt();

        System.out.print("Give your distance in miles:");
        double distance = scanner.nextDouble();
        System.out.print("Give your hour:");
        int h = scanner.nextInt();
        System.out.print("Give your minute:");
        int m = scanner.nextInt();
        System.out.print("Give your second:");
        int s = scanner.nextInt();

        System.out.println("Rezultat adunare:" + adunare(number1, number2));
        thirdExercise(number1, number2);
        System.out.println("Rezultat scadere:" + scadere(number1, number2));
        System.out.println("Rezultat inmultire:" + inmultire(number1, number2));
        fifthExercise(number1, number2);
        System.out.println("Rezultat impartire:" + impartire(number1, number2));
        System.out.println("Average of the numbers is " + seventhExercise(number1, number2, number3));
        System.out.println("C = 5/9 * (F-32) is " + nineExercise(f));
        System.out.println(number1 + " in inches is " + tenthExercise(number1) + "meters");
        System.out.println(number2 + " in inches is " + tenthExercise(number2) + "meters");
        System.out.println(number3 + " in inches is " + tenthExercise(number3) + "meters");


        System.out.println("Distance " + distance + " miles as speed is " + distance / eleventhExercise(h, m, s) + " meters/seconds");
        System.out.println("Distance " + distance + " miles as speed is " + (distance / 1000.0f) / (eleventhExercise(h, m, s) / 3600.0f) + " km/seconds");
        System.out.println("Distance " + distance + " miles as speed is " + ((distance / 1000.0f) / (eleventhExercise(h, m, s) / 3600.0f)) / 1.609f + " miles/seconds");
    }


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

    private static void firstTraining() {
        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(in);

        // 1st exercise: print sum of two numbers
        /*
        byte myByte = scanner.nextByte();
        short myShort = scanner.nextShort();
        int myInt = scanner.nextInt();
        long myLong = scanner.nextLong();
        float myFloat = scanner.nextFloat();
        double myDouble = scanner.nextDouble();
        boolean myBoolean = true;
        String myString = "test";
        */
        int celsius = scanner.nextInt();
        float finalTemp;
        finalTemp = (float) 5 / 9 * (celsius - 32);

        System.out.println("Temperature is " + finalTemp);


        //long result = myInt + myLong;
    /*
        System.out.println(myString + (myByte + myShort + myInt + myLong + myFloat + myDouble) + myBoolean);
        System.out.println(myString + (myByte - myShort - myInt - myLong - myFloat - myDouble) + myBoolean);
        System.out.println(myString + (myByte * myShort * myInt * myLong * myFloat * myDouble) + myBoolean);
        System.out.println(myString + (myByte / myShort / myInt / myLong / myFloat / myDouble) + myBoolean);
*/
        int x = 2;
        x += x += x++ + ++x;
        System.out.println("x =" + x);


    }

    // 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
    public static String firstExercise(String name) {
        return name;
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

    /* 4. Write a Java program to print the result of the following operations:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        */
    public static void forthExercise() {
        int a, b, c, sumInt;
        float sumFloat;
        a = -5;
        b = 8;
        c = 6;

        sumInt = a + b * c;
        System.out.println("Result for 'a. -5 + 8 * 6' is " + sumInt);

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

    // 5. Write a Java program that takes two numbers as input and display the product of two numbers.
    public static void fifthExercise(long first, long second) {
        System.out.print(first + "x" + second + "=" + first * second);
    }

    // 6. Write a Java program to display the following pattern
    public static void sixthExercise() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    // 8. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static float seventhExercise(long first, long second, long third) {
        return (float) (first + second + third) / (3);
    }

    // 9. Write a Java program to display the following pattern
    public static void eightExercise() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    // 10.Write a Java program to convert temperature from Fahrenheit to Celsius degree, using this formula: C = 5/9 * (F-32)
    public static float nineExercise(float temp) {
        return (5f / 9 * (temp - 32));
    }

    // 11.Write a Java program that reads a number in inches, converts it to meters. ( one inch is 0.0254 meters)
    public static double tenthExercise(double number) {
        return number * 0.0254;
    }

    // 12.Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes,
    //seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)
    public static float eleventhExercise(int hour, int minute, int second) {
        return (hour * 3600) + (minute * 60) + second;
    }
}
