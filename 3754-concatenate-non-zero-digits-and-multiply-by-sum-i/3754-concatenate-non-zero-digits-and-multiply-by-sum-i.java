class Solution {
    public long sumAndMultiply(int n) {
        int digit = 0;
        int sum = 0;
        while(n > 0){
            if(n % 10 != 0){
                digit = digit * 10 + n % 10;
            }
            sum = sum + n % 10;
            n = n/10;
        }
        int rev1 = 0;
        while(digit > 0){
            rev1 = rev1 * 10 + digit % 10;
            digit = digit / 10;
        }
        return (long)rev1 * sum;
    }
}