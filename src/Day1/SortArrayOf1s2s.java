package Day1;

import java.util.Arrays;

public class SortArrayOf1s2s {

    // Dutch national algoritghm
    static void sorting(int[] arr) {
        /**
         * we will have 3 checks:
         * 1. mid pointer is pointing to 0
         * 2. mid pointer is pointing to 1
         * 3 . mid pointer is pointing to 2
         */

        int first = 0;
        int mid = 0;
        int last = arr.length - 1;

        int temp;

        //RIP
/*
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:

                    temp = arr[last];
                    arr[last] = arr[first];
                    arr[first] = temp;

                    first++;
                    mid++;
                    last++;
                    break;

                case 1:

                    mid++;

                    break;

                case 2:

                    temp = arr[mid];
                    arr[mid] = arr[last];
                    arr[last] = temp;

                    last--;

                    break;
            }
        }*/
        while (mid <= last) {

            switch (arr[mid]) {
                case 0:

                    // jodi zero hoy tahole mid pointer and low pointer ++ also swap
                    // karon :: 1,0,1,2 / akhane mid++ = 1 break; i r man akhon zero tai case 0 ye jabe
                    // low++ and mid++ too ; kintu jehetu age o mid++ hoiche tai mid=2 and low=1 tai mid r low swap hobe

                    temp = arr[first];
                    arr[first] = arr[mid];
                    arr[mid] = temp;

                    first++;
                    mid++;
                    break;

                case 1:

                    mid++;
                    break;

                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[last];
                    arr[last] = temp;

                    last--;
                    break;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 2};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
