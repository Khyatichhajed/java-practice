
/** que-link - https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1 */
class Gcd {

    /**
     * Euclidean algorithm subtract greater number to smaller one till both are
     * equal return any of both number
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
