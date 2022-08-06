package DSA_sheet;

public class BitonicPoint {
    static int findMaximum(int[] arr, int n) {


        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((mid == n - 1 || arr[mid] > arr[mid + 1]) && (mid == 0|| arr[mid] > arr[mid - 1])) {
                return arr[mid];
            }

            if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }


    //Brute Force
/*    static int findMaximum(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {

                return arr[i];

            }

        }

        return -1;
    }*/

    public static void main(String[] args) {
        int arr[] = {1, 15, 25, 45, 42, 21, 17, 12, 11};

        System.out.println(findMaximum(arr, arr.length));

    }
}
