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
        //op.sumTwoNumbersAndComputeAverage();


    }

}

