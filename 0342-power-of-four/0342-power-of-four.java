class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0)return false;
        for(int i=n; i != 1; i=i/4){
            int fore = i%4;
            if(fore != 0)return false;
        }
        return true;
    }
}