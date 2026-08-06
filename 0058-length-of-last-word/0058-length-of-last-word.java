class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int n = s1.length();
        int ans = 0;
        for(int i=n-1; i>=0; i--){
            if(s1.charAt(i) != ' '){
                ans = ans + 1;
            }else{
                break;
            }
        }
        return ans;
    }
}