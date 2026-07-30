class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            // Can't even reach this index
            if (i > farthest) {
                return false;
            }

            // Update the farthest reachable position
            farthest = Math.max(farthest, i + nums[i]);

            // Already can reach the end
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}

