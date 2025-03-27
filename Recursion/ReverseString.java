package Recursion;
public class ReverseString {
    public static void Reverse(String str, int i) {
        if (i == 0) {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        Reverse(str, i - 1);
    }

    public static int first = -1;
    public static int last = -1;

    // ___________find the 1st and last occurance of an element of an element in
    // string_________________
    public static void Occurence(String word, char letter, int index) {

        if (index == word.length()) {
            System.out.println("first " + first);
            System.out.println("last " + last);
            return;
        }
        char currentchar = word.charAt(index);

        if (currentchar == letter) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }

        }
        Occurence(word, letter, index + 1);

    }
    // _____chack if the array is sorted(strictly inncreasing)

    public static boolean Check(int[] arr, int i) {
        // Base case: If we reach the last element, the array is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // If the current element is greater than the next, return false
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive case: Check the rest of the array
        return Check(arr, i + 1);
    }

    // ___move all the 'x 'to the end of the string(axbcxxd)
    public static String newstring;
    public static int count;

    // Recursive method to move all 'x' to the end of the string
    public static void MoveEnd(String str, int index, int count, String result) {
        // Base case: If the index reaches the end of the string
        if (index == str.length()) {
            // Append all 'x' characters at the end
            for (int i = 0; i < count; i++) {
                result += "x";
            }
            System.out.println(result); // Print the final result
            return; // Stop recursion
        }

        // Check the current character
        if (str.charAt(index) == 'x') {
            // Increment the count of 'x' and move to the next character
            MoveEnd(str, index + 1, count + 1, result);
        } else {
            // Append the current character to the result and move to the next character
            MoveEnd(str, index + 1, count, result + str.charAt(index));
        }
    }

    public static void main(String[] args) {
        // String str = "hello";
        // int i = str.length() - 1;
        // Reverse(str, i);

        // Occurence("ashisha", 'a', 0);
        // int[] array = { 1, 2, 3, 4, 5 };
        // System.out.println(Check(array, 0)); // Output: true
        MoveEnd("xxxttt", 0, 0, "");

    }

}
