class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        int j = 0;
        k = k % n;
        // last ke 3 index ko store karna hai pehle
        for(int i=n-k; i<n; i++){
            arr[j] = nums[i];
            j++;
        }
        // fir start se value last se n-k tak ki value store karna hai
        for(int i=0; i<n-k; i++){
            arr[j] = nums[i];
            j++;
        }
        // for arr[i] jo last ki valur store ki tho bo bhi store karna hai
        for(int i=0; i<n; i++){
            nums[i] = arr[i];
        }
    }
}



