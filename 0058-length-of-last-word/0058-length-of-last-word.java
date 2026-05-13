class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int lengt = str.length();
        int answer = 0;
        for(int i=lengt-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                answer = answer+1;
            }else{
                break;
            }
        }
        return answer;
    }
}