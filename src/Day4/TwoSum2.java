package Day4;

public class TwoSum2 {

    /**
     * // we can use 2 pointer || left pointer at first & right pointer at last
     * // jodi target boro thake left pointer theke tahole right pointer decrease korbo
     * // r jodi choto thake left pointer increase korbo
     */

    

    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {

            int currentSum = numbers[low] + numbers[high];
            if (currentSum > target) {
                high--;
            } else {
                low++;
            }

            if (target == currentSum) {
                return new int[]{low + 1, high + 1};
            }
        }

        return new int[]{low+ 1, high+ 1};
    }



}
