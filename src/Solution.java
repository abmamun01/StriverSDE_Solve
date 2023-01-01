import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();

        helperFunc(0, nums, subSet, ans);
        return ans;


    }

    private void helperFunc(int idx, int[] nums, List<Integer> subSet, List<List<Integer>> ans) {

        if (idx == nums.length) {
            ans.add(new ArrayList<>(subSet));
        } else {

            subSet.add(nums[idx]);

            while (idx + 1 < nums.length && nums[idx] == nums[idx + 1]) idx++;
            helperFunc(idx + 1, nums, subSet, ans);
            subSet.remove(subSet.size() - 1);

            helperFunc(idx + 1, nums, subSet, ans);
        }
    }
}//end of class