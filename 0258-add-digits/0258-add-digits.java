class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int ans = 0;
            for(int i=num; i!=0; i=i/10){
                int rem = i%10;
                ans = ans + rem;
            }
            num = ans;
        }
        return num;
    }
}