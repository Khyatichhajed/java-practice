
import java.util.*;

/**
 * que link -
 * https://www.geeksforgeeks.org/problems/maximum-difference-1587115620/1 Given
 * an integer array arr of integers, the task is to find the maximum absolute
 * difference between the nearest left smaller element and the nearest right
 * smaller element of every element in array arr. If for any component of the
 * arr, the nearest smaller element doesn't exist then consider it as 0.
 */
class FindMaximumDifference {

    public int findMaxDiff(int[] arr) {
        int n = arr.length;

        /**
         * Array for left smaller elements
         */
        int[] ls = new int[n];

        /**
         * Array for right smaller elements
         */
        int[] rs = new int[n];

        /**
         * Processing data for left array
         */
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            ls[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }

        /**
         * Clear stack for right smaller calculation
         */
        stack.clear();

        /**
         * Processing data for right array
         */
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            rs[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }

        /**
         * Calculate maximum absolute difference
         */
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(ls[i] - rs[i]));
        }

        return maxDiff;
    }
}
