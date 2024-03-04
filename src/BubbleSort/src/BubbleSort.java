package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void Sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("the process of the sort" + Arrays.toString(array));

                }
            }
        }
        System.out.println("the end answer" + Arrays.toString(array));

    }
}
