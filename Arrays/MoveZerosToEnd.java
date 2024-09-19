
/**
 * Que-link : https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
 * Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.
 */
class MoveZerosToEnd {

    /**
     * Method to move zeros to end
     */
    void pushZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            /**
             * Logic - Count will stop at first zero till the non zero number
             * comes then swap it, then move forward to either next zero or
             */
            if (arr[i] != 0) {
                swap(count, i, arr);
                count++;
            }
        }
    }

    /**
     * Method to Swap arr[i] with arr[count]
     */
    void swap(int count, int i, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
    }
}
