// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
// Link - https://leetcode.com/problems/3sum/description/?envType=study-plan-v2&envId=top-interview-150

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
      //creating set to store only unique List;
        Set<List<Integer>> ans = new HashSet();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int temp = nums[i] + nums[j] + nums[k];
              //checking if the whether the given condition is satisfying or not.
                if(temp == 0) ans.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if(temp > 0) k--;
                else j++;
            }
        }

        //creating a new new list from set and returning;
        return new ArrayList<>(ans);
    }
}
