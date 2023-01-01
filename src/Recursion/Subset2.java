package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {

        // In this logic we to sort the array

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        helper(nums , 0, new ArrayList<Integer>() , ans);

        return ans;
    }

    void helper(int nums[],int i,List<Integer> subset,List<List<Integer>> ans) {
        // Our base case will hit when our i pointer reaches the end of given array nums[]

        if (i == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        // We pick i-th Element

        subset.add(nums[i]);

        // We ask recursion to do rest of the task

        helper(nums, i + 1, subset, ans);

        // Backtrack and Undo the change we have done

        subset.remove(subset.size() - 1);

        // While using Don't Pick option, we must ensure we skip all the Duplicate Occurrences of nums[i]

        while (i < nums.length - 1 && (nums[i] == nums[i + 1])) {
            i++;
        }

        // Our i pointer will stop on the last Duplciate Occurencce of nums[i]

        // Don't Consider the Element and Ask Recursion to generate Unique Subsets

        helper(nums, i + 1, subset, ans);
        return;

    }
}
