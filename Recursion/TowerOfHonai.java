package Recursion;
public class TowerOfHonai {
    public static void TOH(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        TOH(n - 1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        TOH(n - 1, helper, source, destination);// at this step source works as a helper and helper works as a source

    }

    public static void main(String[] args) {
        int n = 3;
        TOH(n, "S", "H", "D");
    }

}
