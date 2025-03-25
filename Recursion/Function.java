package Recursion;
import java.util.Scanner;

class Function {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {

        if (n < 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateSum(a, b));
        System.out.println(factorial(a));
    }
}