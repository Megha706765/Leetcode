//sir

class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;

        if (num == 0) return true;
        if (num % 10 == 0) return false;

        int rev1 = 0;
        while (num > 0) {
            int d = num % 10;
            rev1 = rev1 * 10 + d;
            num /= 10;
        }

        int rev2 = 0;
        while (rev1 > 0) {
            int d = rev1 % 10;
            rev2 = rev2 * 10 + d;
            rev1 /= 10;
        }

        return rev2 == temp;
    }
}