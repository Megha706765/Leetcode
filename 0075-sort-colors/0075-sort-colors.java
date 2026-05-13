class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
    for (int i = 1; i < n; i++) {
        int key = nums[i]; // Element to insert into the sorted section
        int j = i - 1;
        while (j >= 0 && nums[j] > key) { // Shift larger elements right
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = key; // Place the element in the correct position
    }
    }
}