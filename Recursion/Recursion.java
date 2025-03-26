package Recursion;
public class Recursion {
    public static void PrintNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        PrintNumber(n - 1);
    }

    public static int Sum(int n) {
        if (n == 0) { // Base case: When n is 0, return 0
            return 0;
        }
        return n + Sum(n - 1); // Recursive case: Add n to the sum of numbers from 1 to (n-1)
    }

    public static int Fact(int n) {
        if (n == 0 || n == 1) { // Base case: When n is 0, return 0
            return 1;
        }
        return n * Fact(n - 1); // Recursive case: Add n to the sum of numbers from 1 to (n-1)
    }

    // fibonacii series of the nth term
    public static void Fibbonacci(int first, int second, int n) {
        int counter = n - 2;
        int c = first + second;
        System.out.println(c);
        first = second;
        second = c;
        if (counter > 0) {
            counter = counter - 1;
            Fibbonacci(first, second, counter);
        }

    }
    // find the recursive function of X^n with time complexitiy of logn

    public static int Power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return Power(x, n / 2) * Power(x, n / 2);
        } else {
            return x * Power(x, n / 2) * Power(x, n / 2);
        }
    }

    public static void main(String[] args) {
        // PrintNumber(5);
        // System.out.println(Sum(23));
        // System.out.println(Fact(5));
        // System.out.println(0);
        // System.out.println(1);
        // Fibbonacci(0, 1, 6);
        System.out.println(Power(2, 3));

    }

}
