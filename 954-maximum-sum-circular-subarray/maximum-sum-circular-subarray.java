class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int totalSum = 0;
        
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        
        totalSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            int num = nums[i];
            totalSum += num;
            
            // Maximum subarray
            maxEnding = Math.max(num, maxEnding + num);
            maxSum = Math.max(maxSum, maxEnding);
            
            // Minimum subarray
            minEnding = Math.min(num, minEnding + num);
            minSum = Math.min(minSum, minEnding);
        }
        
        // Important: all negative case
        if (maxSum < 0) {
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }
}
