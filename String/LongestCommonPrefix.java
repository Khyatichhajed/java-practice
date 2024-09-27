/**
 * que link - https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?page=1&status=unsolved,attempted&sortBy=submissions
 */
class LongestCommonPrefix {

    public String longestCommonPrefix(String arr[]) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }

        // Start with the first string as the initial prefix
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            /**
             * For each subsequent string, we check if it starts with the
             * current prefix
             */
            while (arr[i].indexOf(prefix) != 0) {
                
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, return "-1"
                if (prefix.isEmpty()) {
                    return "-1";
                }
            }
        }
        return prefix;
    }
}
