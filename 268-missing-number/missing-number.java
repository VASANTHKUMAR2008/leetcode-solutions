class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        int b= a*(a+1)/2;
        int c =0;
        for( int n:nums){
            c+=n;
             
        }
       
    return b-c ;
         }
}