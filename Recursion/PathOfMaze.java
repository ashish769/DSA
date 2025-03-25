package Recursion;
public class PathOfMaze {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }
        // for the downwardpath;
        int downpath = countPaths(i + 1, j, n, m);
        // for the right path
        int rightpath = countPaths(i, j + 1, n, m);

        return downpath + rightpath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int total = countPaths(0, 0, n, m);
        System.out.println(total);
    }
}
