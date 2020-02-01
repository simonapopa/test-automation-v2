package LoopExercises;

public class LoopMethods {

    //For loop exercise: 4. Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
    //Also compute and display the average.
    public void sumAndAverage() {
        int sum = 0;
        double average;

        for (int i = 1; i <= 100; i++) {
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

    public void outputLikeTreeSimplified(char ch) {
        int i, j;
        for (i = 0; i <= 7; i++) {
            for (j = i; j <= 7; j++) {
                System.out.print(ch);
                if (i == 7) break;
            }
            System.out.println();
        }
    }

    // For loop exercise: 2. Write a java program to count backwards from a given number to a lower given
    //number
    public void getTwoNumbers(int first, int second) {
        int sum;
        if (first > second) {
            sum = first - second;
            for (int i = first; i >= sum; i--)
                System.out.println(i);
        } else {
            sum = second - first;
            for (int i = second; i >= sum; i--)
                System.out.println(i);
        }
    }

    public void getTwoNrVersion(int first, int second) {
        for (int i = first; i >= second; i--)
            System.out.println(i);

        for (int i = second; i >= first; i--)
            System.out.println(i);
    }

    //For loop exercise: 1. Given a number, while the number is equal to or lower than 100, print the number;
    public void givenNumberHundred(int nr) {
        for (int i = nr; i <= 100; i++) {
            System.out.println(i);
            break;
        }
    }

    // Loop exercise: 1. Modify previous ex 4. to use “while-do” loop instead of “for” loop
    public void getTwoNumbersWithWhile(int first, int second) {
        int i = first;
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

    // Loop exercise: 2. Modify the program to use a "do-while" loop.
    public void getTwoNumbersWithDoWhile(int first, int second) {
        int i = first;

        while (i > second) {
            System.out.println(i--);
        }

        do {
            System.out.println(second--);
        } while (second > first);

    }

    // Loop exercise: 3. Modify the program to sum from 111 to 8899, and compute the average. Introduce
    //an int variable called count to count the numbers in the specified range.
    public void sumTwoNumbersAndComputeAverage() {
        int count = 0;
        int sum = 0;
        int nr = 111;
        float average;

        do {
            sum = sum + nr;
            nr++;
            count++;
        } while (nr <= 8899);

        average = sum / count;
        System.out.println("Sum is " + sum + " and count=" + count + " and average=" + average);
    }

    // Loop exercse: 4.Write a program to sum only the odd numbers from 1 to 100, and compute the average.
    public void getSumOfOddNumbersAndComputeAverage() {
        int count = 0;
        int sum = 0;
        int nr = 1;
        float average;

        do {
            if (nr % 2 != 0) {
                sum = sum + nr;
                count++;
            }
            nr++;
        } while (nr <= 100);
        average = sum / count;
        System.out.println("Sum is " + sum + " and count=" + count + " and average=" + average);
    }

    // 5. Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
    public void getSumOfNumbersDivisibleBySevenAndComputeAverage() {
        int count = 0;
        int sum = 0;
        int nr = 1;
        float average;

        do {
            if (nr % 7 == 0) {
                sum = sum + nr;
                count++;
            }
            nr++;
        } while (nr <= 100);
        average = sum / count;
        System.out.println("Sum is " + sum + " and count=" + count + " and average=" + average);
    }

    // 6. Write the program do display the first 20 Fibonacci numbers:
    //0     1	1	2	3	5	8	13	21	34	55	89	144 	233	    377	    610	    987	    1597	2584	4181
    public void getTwentyFibonaciNumbers() {
        int i = 1, n = 20, previous = 0, next = 1, sum = 0;
        System.out.print("First " + n + " Fibonaci numbers: ");

        while (i <= n) {
            System.out.println(previous);
            sum = previous + next;
            previous = next;
            next = sum;
            i++;
        }
    }

    // 7. Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall print "Coza" in place
    // of the numbers which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.
    // The output shall look like:
    //1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
    //Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
    //23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
    public void CozaLozaWoza() {
        int j;
        for (j = 1; j <= 110; j++) {
            if ((j % 3 == 0 && j % 5 == 0)) {
                System.out.println("CozaLoza" + " ");
            } else if (j % 3 == 0) {
                System.out.print("Coza" + " ");
            } else if (j % 5 == 0) {
                System.out.print("Loza" + " ");
            } else if (j % 7 == 0) {
                System.out.print("Woza" + " ");
            } else System.out.print(j + " ");

            if (j % 11 == 0) {
                System.out.println();
            }
        }
    }
}