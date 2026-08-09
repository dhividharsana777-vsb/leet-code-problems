class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        // Step 1: Calculate total sum
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        // Step 2: Traverse and check pivot
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
