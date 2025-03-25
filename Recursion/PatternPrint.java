package Recursion;
class FirstClass {
    public static void main(String[] args) {
        // to print the rectangular
        // for (int j = 0; j < 4; j++) {
        // for (int i = 0; i < 5; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // to print the hollow recangle
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 5) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        // to print the half pyramid

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // if (j <= i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        // to print the inverted half pyramid

        // for (int i = 4; i > 0; i--) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // to print the
        // *
        // **
        // ***
        // ****
        /*
         * for (int i = 0; i < 4; i++) {
         * for (int j = 0; j <= 4 - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 0; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
        /*
         * int number = 1;
         * for (int i = 0; i < 5; i++) {
         * 
         * for (int j = 0; j <= i; j++) {
         * System.out.print(number + " ");
         * number = number + 1;
         * }
         * System.out.println();
         * }
         */

        // to print the butterflies pattern
        /*
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * // for left section
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * // for spaces
         * int space = 2 * (n - i);
         * for (int j = 1; j <= space; j++) {
         * System.out.print(" ");
         * }
         * // for right section
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         * // for lower half
         * for (int i = n; i >= 1; i--) {
         * // for left section
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * // for spaces
         * int space = 2 * (n - i);
         * for (int j = 1; j <= space; j++) {
         * System.out.print(" ");
         * }
         * // for right section
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // for space
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}