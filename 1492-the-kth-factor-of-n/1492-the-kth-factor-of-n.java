class Solution {
    public int kthFactor(int n, int k) {
        // n = 12 , k = 3
        int dig = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                dig++;
            }
            if(dig == k){
                return i;
            }
        }
        return -1;
    }
}