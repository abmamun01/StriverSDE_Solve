package Kotlin

class removeDuplicate {

    fun removeDuplicates(nums: IntArray): Int {
        // base case
        if (nums.size == 0) return 0

        var i = 0

        for (j in nums) {
            if (nums[j] != nums[i]) {
                i++
                nums[i] = nums[j]
            }

        }
        return i + 1
    }
}