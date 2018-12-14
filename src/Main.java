import OtherMethods.ReadNumbersFromKeyboard;
import OtherMethods.Calculator;

public class Main {

    public static void main(String args[]) {
        Calculator calc = new Calculator();
        ReadNumbersFromKeyboard read = new ReadNumbersFromKeyboard();

        System.out.println("Hello world!" + "\n" + calc.getYourName(read.readStringFromKey()));

        calc.forthExercise();
        calc.getYourName();
        calc.printFacePattern();

        System.out.print("Give your distance in miles:");
        double distance = read.readDoubleNumberFromKey();

        System.out.println("Rezultat adunare: " + calc.adunare(read.readLongNumberFromKey(), read.readLongNumberFromKey()));
        calc.getNumbers(read.readLongNumberFromKey(), read.readLongNumberFromKey());
        System.out.println("Rezultat scadere: " + calc.scadere(read.readLongNumberFromKey(), read.readLongNumberFromKey()));
        System.out.println("Rezultat inmultire: " + calc.inmultire(read.readLongNumberFromKey(), read.readLongNumberFromKey()));
        calc.getNumbersProduct(read.readLongNumberFromKey(), read.readLongNumberFromKey());
        System.out.println("Rezultat impartire: " + calc.impartire(read.readLongNumberFromKey(), read.readLongNumberFromKey()));
        System.out.println("Average of the numbers is " + calc.getNumbers(read.readLongNumberFromKey(), read.readLongNumberFromKey(), read.readLongNumberFromKey()));
        System.out.println("C = 5/9 * (F-32) is " + calc.nineExercise(read.readFloatNumberFromKey()));
        System.out.println(read.readLongNumberFromKey() + " in inches is " + calc.tenthExercise(read.readDoubleNumberFromKey()) + "meters");
        System.out.println(read.readLongNumberFromKey() + " in inches is " + calc.tenthExercise(read.readDoubleNumberFromKey()) + "meters");
        System.out.println(read.readLongNumberFromKey() + " in inches is " + calc.tenthExercise(read.readDoubleNumberFromKey()) + "meters");

        System.out.println("Distance " + distance + " miles as speed is " + distance / calc.eleventhExercise(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey()) + " meters/seconds");
        System.out.println("Distance " + distance + " miles as speed is " + (distance / 1000.0f) / (calc.eleventhExercise(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey()) / 3600.0f) + " km/seconds");
        System.out.println("Distance " + distance + " miles as speed is " + ((distance / 1000.0f) / (calc.eleventhExercise(read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey(), read.readIntegerNumberFromKey()) / 3600.0f)) / 1.609f + " miles/seconds");
    }
}