package Day4;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        int longestStreak = 0;

        for (int i = 0; i < nums.length; i++) {
            // checking if a number lesser than the present is exist or not
            // like if present num is 3 then check if 2 exist or not
            if (!hashSet.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                // default value 1 karon jodi value thake single value hole e sequence hobe
                int currentStreak = 1;


                // Checking next number is available or not
                // mane jodi 1 thake tahole 2 ache kina and so on ....
                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);

            }
        }
        return longestStreak;
    }


}
