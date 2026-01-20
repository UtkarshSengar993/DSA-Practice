class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0; //i
        int high=0; //j
        int sum=0;
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        while(high<n){
            sum = sum + nums[high];

            while(sum >= target){
                int len = high-low+1;
                res = Math.min(res,len);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}