class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // place non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // filling remaining with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}