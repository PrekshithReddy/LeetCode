class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int ans=-1;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                {
                    temp=nums[j]-nums[i];
                    ans=Math.max(ans,temp);
                }
            }
        }
        return ans;
    }
}