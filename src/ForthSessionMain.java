import java.util.Scanner;

public class ForthSessionMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        LogicalOperation op = new LogicalOperation();

        System.out.print("Give first: ");
        int f = scanner.nextInt();

        System.out.print("Give second: ");
        int s = scanner.nextInt();

        //op.getTwoNumbers(f,s);
        //op.getTwoNrVersion(f, s);
        //op.getNumberWithWhile(f);
        op.getTwoNumbersWithWhile(f, s);
        //op.getTwoNumbersWithDoWhile(f, s);
    }
}
