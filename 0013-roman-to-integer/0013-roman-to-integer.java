class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int curr  = 0;
        for(int i=0; i<n; i++){
            int ans =0;
            if(s.charAt(i) == 'I')ans = 1;
            else if(s.charAt(i) == 'V')ans =  5;
            else if(s.charAt(i) == 'X')ans = 10;
            else if(s.charAt(i) == 'L')ans = 50;
            else if(s.charAt(i) == 'C')ans = 100;
            else if(s.charAt(i) == 'D')ans = 500;
            else if(s.charAt(i) == 'M')ans = 1000;

            if(i + 1 < n && ans < getValue(s.charAt(i + 1))){
                curr = curr - ans;
            } else{
                curr = curr + ans;
            }

        }
        return curr;
    }
    public int getValue(char ch){
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