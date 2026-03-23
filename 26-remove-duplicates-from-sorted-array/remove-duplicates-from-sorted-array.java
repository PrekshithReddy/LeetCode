class Solution {
    public int removeDuplicates(int[] nums) {
    int k=0;
    int[] temp=new int[nums.length];
    temp[k++]=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]!=nums[i-1])
        {
            temp[k++]=nums[i];
        }
    }
    for(int i=0;i<k;i++){
        nums[i]=temp[i];
    }
    return k;
    }
}