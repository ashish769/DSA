package Recursion;
public class RemoveDuplicate {
    public static void RemoveDuplicate(String str, int i, String newstring) {
        // Base case: When we have processed the entire string
        if (i == str.length()) {
            System.out.println(newstring);
            return;
        }

        char currentchar = str.charAt(i);

        // Check if the current character is already in the newstring
        if (newstring.contains(String.valueOf(currentchar))) {
            // Skip the character and move to the next
            RemoveDuplicate(str, i + 1, newstring);
        } else {
            // Append the character and move to the next
            newstring += currentchar;
            RemoveDuplicate(str, i + 1, newstring);
        }
    }

    public static void main(String[] args) {
        // Test case: Remove duplicates from the string "ashish"
        RemoveDuplicate("ashish", 0, ""); // Output: "ashi"
    }
}
