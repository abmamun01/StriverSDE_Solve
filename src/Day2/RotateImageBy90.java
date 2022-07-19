package Day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RotateImageBy90 {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> flag = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (!flag.contains(nums[i])) {
                flag.add(nums[i]);

            } else return false;
        }

        return true;

    }

    static void rotating(int[][] image) {


        for (int i = 0; i < image.length; i++) {

            for (int j = i; j < image.length; j++) {

                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;

            }
        }


        // reverse image
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length / 2; j++) {
                // comapre first column with last column
                int temp = image[i][j];
                image[i][j] = image[i][image.length - j - 1];
                image[i][image.length - j - 1] = temp;
            }
        }

    }


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotating(arr);

        System.out.println(Arrays.deepToString(arr));
    }

}

