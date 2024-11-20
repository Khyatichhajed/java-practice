
/**
 * Que. link - https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions
 */
class MajorityElement {

    /**
     * Method to find majority element
     */
    static int majorityElement(int arr[]) {
        int probableIndex = chooseMostProbableCandidate(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[probableIndex]) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return arr[probableIndex];
        }
        return -1;
    }

    /**
     * Method to find most possible probableIndex
     */
    static int chooseMostProbableCandidate(int arr[]) {
        int probableIndex = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            /**
             * Logic is based on moore's voting algorithm. This algorithm works
             * on the fact that if an element occurs more than N/2 times, it
             * means that the remaining elements other than this would
             * definitely be less than N/2.
             */
            if (arr[probableIndex] == arr[i]) {
                count++;
            } else {
                /**
                 * Other element is cancelling out current probable element
                 */
                count--;
            }
            /**Making current index most probable, because it has not been cancelled out yet */
            if (count == 0) {
                probableIndex = i;
                count = 1;
            }
        }
        return probableIndex;
    }
}
