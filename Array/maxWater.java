// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Link - https://leetcode.com/problems/container-with-most-water/description/

class MaxWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            max = Math.max(max,Math.min(height[i],height[j]) * (j -i));

            if(height[i] > height[j])
                j--;
            else 
                i++;    
        }
        return max;
    }
}
