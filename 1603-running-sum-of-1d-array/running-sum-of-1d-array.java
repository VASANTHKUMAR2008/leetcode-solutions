class Solution {
    public int[] runningSum(int[] nums) {
        int left =0;
        int temp=0;
        int right =0;
        int n=nums.length;
        int b=0;
        for(right=1;right<n;right++){
            temp=nums[left]+nums[right];
             b= b+temp;
            nums[right]=temp;
            left++;        }
         return nums; 
    }
    
  
}