class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0; // edge case
        int left = 1, right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) { // avoid overflow
                result = mid;     // mid could be the answer
                left = mid + 1;   // search in the right half
            } else {
                right = mid - 1;  // search in the left half
            }
        }
        return result;
    }
}