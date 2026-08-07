class Solution {
    public boolean canAliceWin(int[] nums) {
        int count = 0;
        int doubcount = 0;
        for(int ele : nums){
            if(ele < 10){
                count = count + ele;
            }else{
                doubcount = doubcount + ele;
            }
        }
        return count != doubcount; 
    }
}