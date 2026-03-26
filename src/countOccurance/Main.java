package countOccurance;

import java.util.Scanner;
//Count occurrences
//Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
//
//Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//
//Input
//On the first line you will be given n.
//
//        Output
//On the only output line you should print the count of 7s.
//
//        Constraints
//n>=0
//
//Sample tests
//Input
//717
//Output
//2
//Input
//7
//Output
//1
public class Main {

    public static int count7(int n) {
        if (n == 0) return 0;

        int lastDigit = n % 10;

        if (lastDigit == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(count7(n));
    }
}