class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        while(left<=right){
            if (nums[left]*nums[left]<=nums[right]*nums[right]){
                result[index]=nums[right]*nums[right];
                right-=1;
                index-=1;
            }else{
                result[index]=nums[left]*nums[left];
                left+=1;
                index-=1;
            }
        }
        return result;
    }
}
