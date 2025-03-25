package Recursion;
public class InviteGuest {
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = callGuest(n - 1);
        // pair
        int ways2 = (n - 1) * callGuest(n - 2);

        return ways1 + ways2;
    }

    public static void main(String args[]) {
        System.out.println(callGuest(3));
        ;
    }

}
