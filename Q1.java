class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(nums[mid]!=target){
            if(nums[mid]<target){
                left=mid+1;
                mid=(left+right)/2;
            }else if(nums[mid]>target){
                right=mid-1;
                mid=(left+right)/2;
            }
            if (left>=right && nums[mid]!=target){
                return -1;
            }
        }
        return mid;
    }
}
