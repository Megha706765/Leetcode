class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)return false;
        for(int i=n; i != 1; i=i/2){
            int div = i%2;
            if(div != 0){
                return false;
            }
        }
        return true;
    }
}