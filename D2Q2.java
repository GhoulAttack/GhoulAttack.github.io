class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int left=0;
         int right=0;
         int sum=0;
         int result=Integer.MAX_VALUE;
         while(right<nums.length && left<=right){

             sum+=nums[right];
             while(sum>=target){

                 result=Math.min(result,right-left+1);
                //  left+=1;
                 sum-=nums[left];
                 left+=1;
             }
             right+=1;
         }
         return result==Integer.MAX_VALUE? 0:result;

    }
}
