class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate total sum first (which will act as our rightSum initially)
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            // Subtract current element from rightSum so it only contains sum of elements to the right
            rightSum -= nums[i];
            
            int leftCount = i;
            int rightCount = n - 1 - i;
            
            int leftTotal = leftCount * nums[i] - leftSum;
            int rightTotal = rightSum - rightCount * nums[i];
            
            result[i] = leftTotal + rightTotal;
            
            // Add current element to leftSum for subsequent iterations
            leftSum += nums[i];
        }
        
        return result;
    }
}