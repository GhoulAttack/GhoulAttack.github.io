# GhoulAttack.github.io
打卡记录
Day1: 有段时间没刷题了，先找找感觉：
Q1:
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

Q2:
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

