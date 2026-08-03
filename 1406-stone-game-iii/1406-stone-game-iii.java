class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;

        int[] arr = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {

            arr[i] = Integer.MIN_VALUE;
            int sum = 0;

            for (int k = 0; k < 3 && i + k < n; k++) {
                sum += stoneValue[i + k];
                arr[i] = Math.max(arr[i], sum - arr[i + k + 1]);
            }
        }

        if (arr[0] > 0) return "Alice";
        if (arr[0] < 0) return "Bob";
        return "Tie";
    }
}