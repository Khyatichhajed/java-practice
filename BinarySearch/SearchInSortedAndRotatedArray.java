
/**
 * Que-link : https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
 */
class SearchInSortedAndRotatedArray {

    /**
     * Method to find key in sorted and rotated array arr
     */
    int search(int[] arr, int key) {
        int high = arr.length - 1;
        int low = 0;

        /**
         * binary search
         */
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] == key) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                /**
                 * Left sorted
                 */
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                /**
                 * Right sorted
                 */
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
