public class BinarySearchClas {


    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        while (start <= end) {

            int mid = (end + start )/ 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};

        System.out.println(search(nums, 5));
    }
}
