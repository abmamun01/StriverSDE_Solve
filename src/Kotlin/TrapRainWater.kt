package Kotlin

import java.util.Stack

class TrapRainWater {

    fun trap(height: IntArray): Int {

        var stack: Stack<Int> = Stack();

        var water: Int = 0;
        var i = 0;

        while (i < height.size) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i++)
            } else {
                var pre = stack.pop()
                if (!stack.isEmpty()) {
                    var minHeight = Math.min(height[stack.peek()], height[i])
                    water += (minHeight - height[pre]) * (i - stack.peek() - 1)
                }
            }
        }

        return water
    }

}