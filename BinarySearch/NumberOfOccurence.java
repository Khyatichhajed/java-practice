
/** Que link - https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1 */
class NumberOfOccurence {

    /**
     * Method to find total count of given number x in arr
     */
    int count(int[] arr, int n, int x) {
        int firstIndex = findIndex(arr, n, x, true);
        int lastIndex = findIndex(arr, n, x, false);

        /**
         * If no occurence of x then return 0
         */
        if (firstIndex < 0 && lastIndex < 0) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    /**
     * Method to find first and last occurence of number x in arr by using
     * binary search
     */
    int findIndex(int[] arr, int n, int x, boolean isFirstOccurence) {
        int high = n - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                if (isFirstOccurence) {
                    if (mid == 0 || arr[mid] != arr[mid - 1]) {
                        return mid;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
