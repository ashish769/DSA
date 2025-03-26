package Recursion;
public class PlaceTile {
    public static int putTile(int n, int m) {

        if (n == m) {
            return 2;

        }
        if (n < m) {
            return 1;

        }
        // vertically placement
        int veticalplacement = putTile(n - m, m);
        // horizontally pacement
        int horizontalplacement = putTile(n - 1, m);
        return horizontalplacement + veticalplacement;
    }

    public static void main(String args[]) {
        int n = 1, m = 2;
        System.out.println(putTile(n, m));
        ;

    }

}
