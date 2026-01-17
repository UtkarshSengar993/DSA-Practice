class Solution {
        public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k%n == 0) return;
        k = k%n;

        rev(nums,0,n-1);//puri list rotate ho jayegi
        rev(nums,0,k-1);//Yrev 
        rev(nums,k,n-1);//Xrev
    }
    public void rev(int[] nums, int start, int end){
        while(start<=end){
            //swap function
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;//start=start+1
            end--;//end=end-1
        }
        
    }

}