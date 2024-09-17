// Given a string s, find the length of the longest substring without repeating characters.
// Url - https://leetcode.com/problems/longest-substring-without-repeating-characters/

class LengthOfLongestSubstring {
    // Using sliding window technique
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            //checking if the character is already present in the set then we will remove it starting from the front
            if (set.contains(s.charAt(j))) {
                while (set.contains(s.charAt(j)) && i < j) {
                    set.remove(s.charAt(i));
                    i++;
                }
            } else {
                //adding characters to the the set.
                set.add(s.charAt(j));
                j++;
            }

            //checking the max size of the set as it is going to give us our final output.
            ans = Math.max(ans, set.size());

        }
        return ans;
    }
}
