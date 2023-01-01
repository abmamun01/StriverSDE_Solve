package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();


        helperFu(1, n, k, subList, ans);

        return ans;
    }

    private void helperFu(int idx, int n, int k, List<Integer> subList, List<List<Integer>> ans) {

        // If k is equal to 0, we have generated a Valid Subset of K length
        if (k == 0) {
            ans.add(new ArrayList<>(subList));
        }

        // If we don't have enough elements to make our subset, we shouldn't proceed further
        if (k > n - idx + 1) return;

        // If idx becomes greater than N, we should stop going forward
        if (idx > n) return;



// Our logic remains exactly same as Generating Subsets

        // Pick i-th Element
        subList.add(idx);
        // Ask Recursion to do the same work for rest of the Task
        helperFu(idx + 1, n, k - 1, subList, ans);

        // Skipping ith element /// Backtracking and undo the change
        subList.remove(subList.size() - 1);

        // Don't pick the i-th Element
        helperFu(idx + 1, n, k, subList, ans);
    }


    public static void main(String[] args) {

    }
}
