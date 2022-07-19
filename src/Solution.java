import java.util.Arrays;

public class Solution {
    public static int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                result[index] = nums[left] * nums[left];
                left++;
            } else {

                result[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};

        System.out.println(Math.abs(31));
        System.out.println((Arrays.toString(sortedSquares(arr))));
    }
}
