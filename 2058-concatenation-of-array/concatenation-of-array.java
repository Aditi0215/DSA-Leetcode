class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length;j<result.length;j++){
                result[i] = nums[i];
                result[j] = nums[i++];
            }
        }
        return result;
    }
}