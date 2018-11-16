import java.util.Scanner;

public class ForthSessionMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        LogicalOperation op = new LogicalOperation();

        System.out.print("Give first: ");
        int first = scanner.nextInt();

        System.out.print("Give second: ");
        int second = scanner.nextInt();

        //For loop exercises
        //op.getTwoNumbers(first,second);
        //op.getTwoNrVersion(first, second);
        //op.givenNumberHundred(first);
        //op.outputLikeTreeMultipleForLoops();
        //op.outputLikeTreeSimplified();
        //op.sumAndAverage();

        //While loop exercises
        //op.getNumberWithWhile(first);
        //op.getTwoNumbersWithWhile(first, second);
        //op.getTwoNumbersWithDoWhile(first, second);


    }

    public static void printMaxFromArrayForEach() {
        int[] array = {2, 1, 6, 8, 3, 0, 7, 4};
        int max = array[0];
        for ( int i : array ) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max = " + max);
    }
}
