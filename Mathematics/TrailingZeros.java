
/** que link - https://www.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1 */
class TrailingZeros {
    /**
     * for trailing zero you have to caltulate number of times
     * 5 appears in prime factorization of all the number in factorial
     */
    static int trailingZeroes(int N) {
        int x = 5;
        int result = 0;
        while (x <= N) {
            result = result + (N / x);
            x = x * 5;
        }
        return result;
    }
}
