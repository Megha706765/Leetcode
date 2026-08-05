class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i=0; i<n; i++){
            if(check(words[i]))return words[i];
        }
        return "";
    }
    public boolean check(String s){
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}