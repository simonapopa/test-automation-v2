package IfSwitchExercises;

import java.util.Scanner;

public class ThirdSessionMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        IfSwitchMethods ism = new IfSwitchMethods();

        // int first = scanner.nextInt();
        // int second = scanner.nextInt();

        System.out.print("Give text: ");
        String input = scanner.next();
        System.out.print("Give a number: ");
        double number = scanner.nextDouble();

        System.out.print("Give first nr to compare: ");
        double first = scanner.nextDouble();
        System.out.print("Give second nr to compare: ");
        double second = scanner.nextDouble();
        System.out.print("Give third nr to compare: ");
        double third = scanner.nextDouble();

        // System.out.println("The bigger number is " + ism.getMax(first, second));
        //System.out.println(ism.matchText(input));
        // System.out.println(ism.equalOrHigherThanTwo(number));
        // System.out.println(ism.getInput(input, number));
        // System.out.println(ism.checkInput(number) + number);
        //System.out.println(ism.getIntComp(number));
        //System.out.println(ism.getPressedNr(number));
        // System.out.println(ism.checkIfEvenNr(number));
        //System.out.println(ism.checkIfCanVote(number));
        System.out.println(ism.printGreatestNumber(first, second, third));
    }


}
