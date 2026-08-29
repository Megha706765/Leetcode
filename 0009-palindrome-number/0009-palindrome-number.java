class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        int pal = 0;
        for(int i=x; i!=0; i=i/10){
            int div = i%10;
            pal = pal * 10 + div;
        }
        if(pal == x)return true;
        else return false;
    }
}