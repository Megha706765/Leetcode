class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int mi = 0;
          for(int i=0; i<n; i++){
            if(nums[i] > max){
                    max = nums[i]; 
                    mi = i;
            }
        }
        for(int i=0; i<n; i++){
            if(max == nums[i]){
             nums[i] = -1;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] > max/2){
                return -1;
            }
        }

      
        return mi;
    }
}











// class Solution {
//     public int dominantIndex(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         int max = 0;
//         for(int i=0; i<n; i++){
//             max = Math.max(max,i);
//             if(max<=i){
//                 return 1;
//             }else{
//                 return -1;
//             }
//         }
//         return 1;
//     }
// }