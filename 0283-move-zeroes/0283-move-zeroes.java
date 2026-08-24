class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Step 1: Shift all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Step 2: Fill the remaining indices with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}