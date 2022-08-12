package Day7;

public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0 || nums[0] == 0) return 0;

        int maxConsecutive = 0;
        int counter = 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[j] == nums[i]) {
                counter++;
                if (counter > maxConsecutive) maxConsecutive = counter;
            } else {
                counter = 0;
            }

        }

        return maxConsecutive;
    }
}
