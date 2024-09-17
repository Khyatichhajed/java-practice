// Given a string s, find the length of the longest substring without repeating characters.
// Url - https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

      //creating two variables as we are going to use sliding-window technique.
        int i =0;
        int j =0;
        HashSet<Character> set = new HashSet<>();

        while(j < s.length()){
          //checking if the character is already present in the set then we will remove it as we only need the unique characters. 
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j)) && i < j ){
                    set.remove(s.charAt(i));
                    i++;
                }
            }else {
              //adding characters to the the set.
                set.add(s.charAt(j));
                j++;
            }

          //chccking the max size of the set as it is going to give us our final output.
            ans = Math.max(ans,set.size());

        }
        return ans;
    }
}
