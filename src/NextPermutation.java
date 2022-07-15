import java.util.Arrays;

public class NextPermutation {
    static void nextPerm(int[] arr) {

        if (arr == null || arr.length <= 1) return;

        // jehetu back theke compare korbo tai -2 and compare with i+1
        int i = arr.length - 2;

        // ager value r sathe porer ta compare
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        // jodi breakPoint pawa jay tahole oi element r sathe swap
        if (i >= 0) {
            int j = arr.length - 1;
            // checking breakpoint r ager element gula ki choto kina
            // who is greater then i :: 1,3,2 ar modde traverse korar sathe sathe
            // first element e 2 porbe r jehetu 2 > 1 theke boro tai while loop break
            // korbe then swap hobe
            while (arr[j] <= arr[i]) j--;
            System.out.println("J "+arr[j]+"  I "+arr[i]);
            swap(arr, i, j);
        }
        // suppose: 5,4,3,2,1 jodi last r ele choto hoy tahole i-- hote hote
        // akdom i r value 0 te aisa porbe tai reverse koro
        reverse(arr, i + 1, arr.length - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        System.out.println("Reverse called ");
        while (i < j) swap(arr, i++, j--);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println("Swap called ");

    }


    public static void main(String[] args) {
        int[] arr = {1, 3,2};
        nextPerm(arr);

        System.out.println(Arrays.toString(arr));


    }
}
