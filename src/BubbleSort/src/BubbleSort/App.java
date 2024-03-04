package BubbleSort;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // int[] arr = { 7, 3, 2, 4, 6, 5, 1, 8 };
        System.out.println("Please scnaf the length of your array");
        int i = 0;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        System.out.println("Please scannf the numbers of the array");
        int o = 0;
        int[] array = new int[i];
        for (; o < i; o++) {
            array[o] = in.nextInt();

        }
        System.out.println("Your origin array is " + Arrays.toString(array));
        // System.out.println(Arrays.toString(arr));
        BubbleSort.Sort(array);
    }

}
