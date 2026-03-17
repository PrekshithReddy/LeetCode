class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int[] freq = new int[100001]; // constraint-based size

        long sum = 0;
        long maxSum = 0;
        int distinct = 0;

        for (int i = 0; i < nums.length; i++) {

            // add current element
            sum += nums[i];
            if (freq[nums[i]] == 0) distinct++;
            freq[nums[i]]++;

            // shrink window if size > k
            if (i >= k) {
                int left = nums[i - k];
                sum -= left;
                freq[left]--;
                if (freq[left] == 0) distinct--;
            }

            // check valid window
            if (i >= k - 1 && distinct == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}