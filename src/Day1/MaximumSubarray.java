package Day1;

public class MaximumSubarray {
    // Kadanes Algorithm

/*
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // prottekta element sum r sathe jog korbo
            sum += nums[i];

            // sum r man jodi max theke boro hoy tahole
            // sum r man niye nibo max r vitor
            if (sum >= max) max = sum;
            // jodi sum r man negative hoye jay tahole
            // sum k abar 0 kore dibo
            if (sum < 0) sum = 0;


        }

        return max;
    }
*/


    public static int maxSubArray(int[] nums) {

        // if (nums.length == 1) return nums[0];

        int sum = 0;
        int maxVal = Integer.MIN_VALUE;

        System.out.println(maxVal);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxVal) maxVal = sum;
            if (sum < 0) sum = 0;

        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
