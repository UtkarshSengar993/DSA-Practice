class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int current = 1;
        int count = 1;
     
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > nums[i-1]){
                current++;
            }
            else{
                current = 1;
            }
            count = Math.max(count,current);
        }
        return count;
    }
}

