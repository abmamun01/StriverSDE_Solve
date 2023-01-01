package ApnaClgDSA;

import java.util.HashSet;

public class MaximumSubarray {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet();

        for (int i : nums) {

            if (set.contains(i)) {
                return false;
            }
        }

        return true;
    }
}
