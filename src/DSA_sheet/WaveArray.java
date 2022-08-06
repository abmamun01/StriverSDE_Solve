package DSA_sheet;

import java.util.Arrays;

public class WaveArray {

    public static void convertToWave(int n, int[] a) {

        for (int i = 1; i < n; i += 2) {

            if (a[i] > a[i - 1]) {
                swapf(a, i, i - 1);
            }
        }

    }

    private static void swapf(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        convertToWave(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }
}
