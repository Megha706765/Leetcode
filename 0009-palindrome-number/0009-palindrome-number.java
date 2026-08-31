class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        int ans = 0;
        for(int i=x; i!=0; i=i/10){
            int rem = i%10;
            ans = ans * 10 + rem;
        }
        if(ans == x)return true;
        return false;
    }
}