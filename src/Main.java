import java.util.Scanner;

import static java.lang.System.in;

public class Main extends Calculator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(in);
        //Calculator calc = new Calculator();
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
}