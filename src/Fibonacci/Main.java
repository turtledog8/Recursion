package Fibonacci;
import java.util.Scanner;
//Fibonacci
//The Fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth Fibonacci number, with n=0 representing the start of the sequence.
//
//Input
//On the first line you will be given n.
//
//        Output
//On the only output line you should print fib(n)
//
//Constraints
//n>=0
public class Main {

    public static long fibonacci(int n) {
        return fibHelper(n, 0, 1);
    }

    public static long fibHelper(int n, long a, long b) {
        if (n == 0) return a;
        if (n == 1) return b;

        return fibHelper(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }
}