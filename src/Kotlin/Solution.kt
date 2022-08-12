package Kotlin

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray) {

        var maxCount = 0;
        var count = 0;

        for (i in nums.indices) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount)
            } else {
                count= 0;
            }
        }

    }
}