class Solution {
    public int maximumDifference(int[] nums) {
        int MaxDiff=0;
        int leastvalue=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(leastvalue<nums[i])
            {
                int diff=nums[i]-leastvalue;
                MaxDiff=Math.max(MaxDiff,diff);
            }
            else{
                leastvalue=nums[i];
            }
        }
             if(MaxDiff==0){
                return -1;
             }
             else{
                return MaxDiff;
             }
    }
}