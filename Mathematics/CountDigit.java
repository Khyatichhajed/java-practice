
/** que link - https://www.geeksforgeeks.org/problems/count-digits5716/0
 *
 * Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
 */

class CountDigit {

    static int evenlyDivides(int N) {
        /**
         * this calculates number of digits in a number
         * log10(N)= how many time N is divided by 10 to get 0
         */
        int c = (int) Math.floor(Math.log10(N));
        int r = 0;
        String s = Integer.toString(N);
        while (c >= 0) {
            int k = (int) s.charAt(c) - '0';
            // System.out.println(N%k);
            if (k > 0 && (N % ((int) s.charAt(c) - '0') == 0)) {
                r++;
            }
            c--;
        }
        return r;

    }
}
