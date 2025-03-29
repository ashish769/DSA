package Backtracking;

public class problem1 {
    public static void Printpermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            Printpermutation(newstr, perm + currchar, idx + 1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        Printpermutation(str, "", 0);
    }

}
