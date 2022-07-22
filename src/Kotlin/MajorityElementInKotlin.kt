package Kotlin

class MajorityElementInKotlin {


    fun majorityElement(nums: IntArray): Int {

        var count: Int = 0
        var candiDate = 0;

        nums.forEach { num ->
            if (count == 0) candiDate = num

            if (num == candiDate) count++;
            else count--;
        }

        return candiDate;
    }
}