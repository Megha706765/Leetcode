class Solution {
    public long removeZeros(long n) {
        long rev = 0;
        for(long i=n; i != 0; i=i/10){
            long dig = i%10;
            if(dig != 0){
                rev = rev * 10 + dig;
            }
        }
        long fig = 0;
        for(long i=rev; i != 0; i=i/10){
            long sig = i % 10;
            if(sig != 0){
                fig = fig * 10 + sig;
            }
        }
        return fig;
    }
}