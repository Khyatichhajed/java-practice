/**
 * que link - https://www.geeksforgeeks.org/problems/rope-cutting3334/1
 * You are given array arr of length of ropes. A cut operation is performed on ropes such that all of them are reduced by the length of the smallest rope. Return the number of ropes left after every cut operation until the length of each rope is zero.
 */
import java.util.*;

class RopeCutting {

    public ArrayList<Integer> RopeCutting(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> l = new ArrayList<>();
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count = n - (i + 1);
                l.add(count);
            }
        }
        return l;
    }
}
