import java.util.Scanner;

public class ThirdSessionMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // int first = scanner.nextInt();
        // int second = scanner.nextInt();

        System.out.println("Give text:");
        String input = scanner.next();
        System.out.println("Give a number:");
        int number = scanner.nextInt();

        // System.out.println("The bigger number is " + getMax(first, second));
        //System.out.println(matchText(input));
        // System.out.println(equalOrHigherThanTwo(number));


    }

    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String matchText(String input) {
        if (input.equals("Evozon")) {
            return input;
        } else {
            return input;
        }

    }

    // Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number

    public static int equalOrHigherThanTwo(int nr) {
        if (nr >= 2 && nr <= 8) {
            return nr;
        }
        return 0;
    }

    //Given a text input and a number input, if the text is equal to “Evozon” AND the number
    //is equal to or lower than 3, print the text and the number. If the text is not “Evozon” AND
    //the number is equal to or higher than 4, print the number and the text, in this order.

    public static String getInput(String input, String nr) {
        if (input.equals("Evozon")) {
            return input;
        }
        return input;
    }
}
