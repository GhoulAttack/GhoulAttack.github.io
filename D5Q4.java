class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        if(nums==null || nums.length<2){
            return result;
        }
        Map<Integer,Integer> match=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(match.containsKey(temp)){
                result[0]=i;
                result[1]=match.get(temp);
                return result;
            }
            match.put(nums[i],i);
        }
        return result;
    }
}
