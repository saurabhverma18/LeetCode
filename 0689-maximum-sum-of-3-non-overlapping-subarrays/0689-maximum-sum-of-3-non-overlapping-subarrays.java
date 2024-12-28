class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] sum_k = new int[n - k + 1];
        int sum = 0;
        
        // Calculate the sum of all subarrays of length k
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (i >= k) sum -= nums[i - k];
            if (i >= k - 1) sum_k[i - k + 1] = sum;
        }
        
        // Find the maximum sum subarray for the left and right sides
        int[] left = new int[n - k + 1];
        int[] right = new int[n - k + 1];
        int best = 0;
        
        for (int i = 0; i < sum_k.length; i++) {
            if (sum_k[i] > sum_k[best]) best = i;
            left[i] = best;
        }
        
        best = sum_k.length - 1;
        for (int i = sum_k.length - 1; i >= 0; i--) {
            if (sum_k[i] >= sum_k[best]) best = i;
            right[i] = best;
        }
        
        
        int[] result = new int[3];
        int maxSum = 0;
        
        for (int i = k; i < sum_k.length - k; i++) {
            int l = left[i - k];
            int r = right[i + k];
            int total = sum_k[l] + sum_k[i] + sum_k[r];
            if (total > maxSum) {
                maxSum = total;
                result[0] = l;
                result[1] = i;
                result[2] = r;
            }
        }
        
        return result;
    }
}
