package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences {

    // Recursive function to print all
// possible subsequences for given array
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> list) {

        // Print the subsequence when reach
        // the leaf of recursion tree
        if (index == arr.length) {

            // Condition to avoid printing
            // empty subsequence
            if (list.size() > 0)
                System.out.println(list);
        } else {

            // Subsequence without including
            // the element at current index

         //   System.out.println("idx " + index  );
            printSubsequences(arr, index + 1, list);

            list.add(arr[index]);


            // Subsequence including the element
            // at current index
         //   System.out.println("idx2 " +index);

            printSubsequences(arr, index + 1, list);

            // Backtrack to remove the recently
            // inserted element
           list.remove(list.size() - 1);
        }
        return;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // Auxiliary space to store each path
        ArrayList<Integer> path = new ArrayList<>();

        printSubsequences(arr, 0, path);
    }
}