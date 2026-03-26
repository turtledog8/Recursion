package sumDigits;
import java.util.Scanner;
//Sum Digits
//Write a program that reads a four-digit number and displays the sum of its digits
//
//1213 => 1 + 2 + 1 + 3 = 7
//        2346 => 2 + 3 + 4 + 6 = 15
//Input
//On the first line, you will receive the four-digit number N
//        Output
//On the only line of output, print the sum of digits
//Constraints
//1000 <= N <= 9999
public class Main {

    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sumDigits(n));
    }
}