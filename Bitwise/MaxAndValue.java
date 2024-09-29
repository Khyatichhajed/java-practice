
/**
 * Que link - https://www.geeksforgeeks.org/batch/dsa-4/track/DSASP-BitMagic/problem/maximum-and-value-1587115620
 */
class MaxAndValue {

    // Function for finding maximum AND value.
    public static int maxAND(int arr[], int N) {
        int count = 0, res = 0;

        /**
         * 10^5 have maxof 31 bits, So starting from 31 to find max bit if any 2
         * value in array have a set bit at same position that will
          * have maximum AND value
         */
        for (int i = 31; i >= 0; i--) {
            count = checkBits(res | 1 << i, arr);
            if (count >= 2) {
                res = res | 1 << i;
            }
        }
        return res;
    }

    public static int checkBits(int checkedBit, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((checkedBit & arr[i]) == checkedBit) {
                count++;
            }
        }
        return count;
    }
}
