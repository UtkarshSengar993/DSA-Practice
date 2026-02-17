class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        int noDelete = arr[0];     // max sum ending here (no deletion)
        int oneDelete = 0;         // max sum ending here (one deletion used)
        int maxSum = arr[0];
        
        for (int i = 1; i < n; i++) {
            
            oneDelete = Math.max(noDelete, oneDelete + arr[i]);
            noDelete = Math.max(arr[i], noDelete + arr[i]);
            
            maxSum = Math.max(maxSum, Math.max(noDelete, oneDelete));
        }
        
        return maxSum;
    }
}
