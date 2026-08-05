class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            int curr = 0;
            if(s.charAt(i) == 'I')curr = 1;
            else if(s.charAt(i) == 'I')curr = 1;
            else if(s.charAt(i) == 'V')curr = 5;
            else if(s.charAt(i) == 'X')curr = 10;
            else if(s.charAt(i) == 'L')curr = 50;
            else if(s.charAt(i) == 'C')curr = 100;
            else if(s.charAt(i) == 'D')curr = 500;
            else if(s.charAt(i) == 'M')curr = 1000;

            if(i+1 < n && curr < getVal(s.charAt(i+1))){
                ans = ans - curr;
            }else{
                ans = ans + curr;
            }
        }
        return ans;
    }
    public int getVal(char ch){
        if(ch == 'I')return 1;
        if(ch == 'V')return 5;
        if(ch == 'X')return 10;
        if(ch == 'L')return 50;
        if(ch == 'C')return 100;
        if(ch == 'D')return 500;
        if(ch == 'M')return 1000;
        return 0;
    }
}