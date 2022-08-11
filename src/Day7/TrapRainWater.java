package Day7;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TrapRainWater {
    public int trap(int[] height) {

        int n = height.length;
        int left = 0, right = n - 1;
        int result = 0;
        int maxLeft = 0, maxRight = 0;

        while (left <= right) {

            if (height[left] <= height[right]) {

                // jodi Max theke boro hoy tahole new Max hobe ata
                if (height[left] >= maxLeft) maxLeft = height[left];
                    // jodi Max theke choto hoy tahole ata to water store korte parbe
                    // current position -- korlam
                else result += maxLeft - height[left];
                left++;
            } else {
                // checking if current height is greater
                if (height[right] >= maxRight) maxRight = height[right];
                else result += maxRight - height[right];

                right--;
            }
        }
        return result;

    }


    public int trapa(int[] height) {
        if (height == null || height.length < 2) return 0;

        Stack<Integer> stack = new Stack<>();
        int water = 0, i = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i++);
            } else {
                int pre = stack.pop();
                if (!stack.isEmpty()) {
                    // find the smaller height between the two sides
                    int minHeight = Math.min(height[stack.peek()], height[i]);
                    // calculate the area
                    water += (minHeight - height[pre]) * (i - stack.peek() - 1);
                }
            }
        }
        return water;
    }

}
