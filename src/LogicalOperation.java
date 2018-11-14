public class LogicalOperation {

    // 2. Modify the program to use a "do-while" loop.

    public void getTwoNumbersWithDoWhile(int first, int second) {
        int i = first;

        do {
            System.out.println(i--);

        } while (i > second);

        do {
            System.out.println(second--);

        } while (second > first);

    }

    // 1. Modify previous ex 4. to use “while-do” loop instead of “for” loop
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

}


