class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int b = nums[0];

        while(b>0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}