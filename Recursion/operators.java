package Recursion;
public class operators {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int a = 10;
        // int b = 0;
        // b = a++;//first return value and the return value
        // System.out.println(a);//11
        // System.out.println(b);//10

        // int a = 10;
        // int b = 0;
        // b = ++a;//first return value and the return value
        // System.out.println(a);//11
        // System.out.println(b);//11

        // ______________bit manipulation in java_____________
        // get bit
        // int n = 5;//0101
        // int pos = 2;//to find the 2 position of the number is 1 or zero
        // int bitMask = n << pos;

        // if ((bitMask & n) == 0) {
        // System.out.println("bit was zero");
        // } else {
        // System.out.println("bit was 1");
        // }

        // -----------------sorting _________________
        // 1.bubble sorting

        int arr[] = { 6, 5, 4, 3, 2 };

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {//to swap the position of the
        // variable so we only swap until the len-1-i because at first no any value is
        // changed after onetime changed big value is placed at the last position so
        // loop run until the second
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }

        // }
        // PrintArray(arr);

        // 2.selection sort

        // for (int i = 0; i < arr.length - 1; i++) {
        // int small = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[small] > arr[j]) {
        // small = j;
        // }
        // int temp = arr[small];
        // arr[small] = arr[i];
        // arr[i] = temp;
        // }
        // }
        // PrintArray(arr);

        // ______________insertion sort___________

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[i]) {
                arr[j + 1] = arr[i];
                j--;
            }
            arr[j + 1] = current;
        }
        PrintArray(arr);

    }
}
