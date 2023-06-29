class Solution {
    public int removeElement(int[] nums, int val) {
       int left=0;
       int right=nums.length;
       while(left<right){
          if(nums[left]==val){

              right-=1;
              nums[left]=nums[right];

          }else{
              left+=1;
          }
       }
       return left;
    }
}
