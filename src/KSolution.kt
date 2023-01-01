import java.util.ArrayList

class KSolution {

    var ti = TreeNode(5)
    var v = ti.`val`

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }


    fun subsets(nums: IntArray): List<List<Int>> {

        var subsets: ArrayList<Int> = ArrayList<Int>()
        var ans: ArrayList<ArrayList<Int>> = ArrayList()


        helperFunc(0, nums, subsets, ans)

        return ans;
    }

    private fun helperFunc(start: Int, nums: IntArray, subsets: MutableList<Int>, ans: ArrayList<ArrayList<Int>>) {

        if (start >= nums.size) {
            ans.add(ArrayList(subsets))
        } else {

            subsets.add(nums[start])
            helperFunc(start + 1, nums, subsets, ans)

            //Backtrack
            subsets.remove(nums.size - 1);
            helperFunc(start + 1, nums, subsets, ans)
        }
    }
}