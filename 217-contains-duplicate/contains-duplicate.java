class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0 , j = 1;
        while(j<n){
            if(nums[j] == nums[j-1]){
                j++;
                return true;
            }
            nums[i+1] = nums[j];
            i++;
            j++;
        }
        return false;
    }
}