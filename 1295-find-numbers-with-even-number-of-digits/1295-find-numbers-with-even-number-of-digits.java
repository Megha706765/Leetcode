class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int ele : nums){
            int digit = 0;
            int temp = ele;
            if(temp == 0)return 1;
            else{
                while(temp != 0){
                    temp = temp /10;
                    digit++;
                }
            }

            if(digit % 2 == 0){
                count = count + 1;
            }
        }
        return count;
    }
}