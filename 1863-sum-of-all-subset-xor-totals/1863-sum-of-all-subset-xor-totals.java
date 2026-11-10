class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
    private int dfs(int[] nums, int i, int currentXor) {
        if (i == nums.length) {
            return currentXor;
        }
        return dfs(nums, i + 1, currentXor ^ nums[i])
             + dfs(nums, i + 1, currentXor);
    }
}