
/**
 * que-link : https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
 */
class AllocateMinPages {

    /**
     * Function to find minimum number of maximum pages a student can read.
     */
    public static long findPages(int n, int[] arr, int m) {
        /**
         * If number of books is less than students
         */
        if (arr.length < m) {
            return -1;
        }
        int low = -1, high = 0;
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        while (low <= high) {
            /**
             * Avg of total number of pages and max number of pages
             */
            int avg = (low + high) / 2;
            if (isFesible(arr, avg, n, m)) {
                res = avg;
                /**
                 * Checking with lower avg
                 becuase we have to find minimum of max pages) */
                high = avg - 1;  
            } else {
                low = avg + 1;
            }
        }
        return res;
    }

    /**
     * Checking If current avg can be read by given number of student
     */
    public static boolean isFesible(int[] arr, int avg, int n, int m) {
        int req = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > avg) {
                req++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return req <= m;
    }
};
