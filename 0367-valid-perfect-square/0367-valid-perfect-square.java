class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        long mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if((long)mid*mid == (long)num)return true;
            else if((long)mid*mid > (long)num){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}