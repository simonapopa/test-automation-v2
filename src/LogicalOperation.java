public class LogicalOperation {

    //For loop exercise: 4. Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
    //Also compute and display the average.

    public void sumAndAverage() {
        int sum = 0;
        double average;

        for ( int i = 1; i <= 100; i++ ) {
            sum += i;
        }
        average = sum / 100;
        System.out.println("Sum is " + sum + " and average is " + average);
    }


    //For loop exercise: 3. Write a Java program by using two for loops to produce the output shown below:
    //*******
    //******
    //*****
    //****
    //***
    //**
    //*

    public void outputLikeTreeSimplified() {
        int i, j;
        char ch = '*';
        for ( i = 0; i <= 7; i++ ) {

            for ( j = i; j <= 7; j++ ) {
                System.out.print(ch);
                if (i == 7) break;
            }
            System.out.println();
        }
    }

    public void outputLikeTreeMultipleForLoops() {
        int i;
        char ch = '*';

        for ( i = 0; i <= 7; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        for ( i = 0; i <= 6; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        for ( i = 0; i <= 5; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        for ( i = 0; i <= 4; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        for ( i = 0; i <= 3; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        for ( i = 0; i <= 2; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        for ( i = 0; i <= 1; i++ ) {

            System.out.print(ch);

        }
        System.out.println();
        System.out.print(ch);

    }

    // For loop exercise: 2. Write a java program to count backwards from a given number to a lower given
    //number
    public void getTwoNumbers(int first, int second) {
        int sum;
        if (first > second) {
            sum = first - second;
            for ( int i = first; i >= sum; i-- )
                System.out.println(i);
        } else {
            sum = second - first;
            for ( int i = second; i >= sum; i-- )
                System.out.println(i);
        }
    }

    public void getTwoNrVersion(int first, int second) {

        for ( int i = first; i >= second; i-- )
            System.out.println(i);

        for ( int i = second; i >= first; i-- )
            System.out.println(i);
    }

    //For loop exercise: 1. Given a number, while the number is equal to or lower than 100, print the number;
    public void givenNumberHundred(int nr) {
        for ( int i = nr; i <= 100; i++ ) {
            System.out.println(i);
            break;
        }
    }

    // Loop exercise: 2. Modify the program to use a "do-while" loop.

    public void getTwoNumbersWithDoWhile(int first, int second) {
        int i = first;

        do {
            System.out.println(i--);

        } while (i > second);

        do {
            System.out.println(second--);

        } while (second > first);

    }

    // Loop exercise: 1. Modify previous ex 4. to use “while-do” loop instead of “for” loop
    public void getTwoNumbersWithWhile(int first, int second) {

        int i = first;
        // int j = second;
        while (i >= second) {
            System.out.println(i--);

        }
        while (second >= first) {
            System.out.println(second--);
        }
    }

    public void getNumberWithWhile(int nr) {
        while (nr <= 100) {
            System.out.println(nr++);
        }
    }

    // Loop exercise: 3. Modify the program to sum from 111 to 8899, and compute the average. Introduce
    //an int variable called count to count the numbers in the specified range.


}


