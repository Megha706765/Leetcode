class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pro1 = nums[n-1] * nums[n-2] * nums[n-3];
        int pro2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(pro1,pro2);
        //  this not otimal approch tc is o(n longn) sort  
    }
}

// sliding window se bhi kar sakte hai