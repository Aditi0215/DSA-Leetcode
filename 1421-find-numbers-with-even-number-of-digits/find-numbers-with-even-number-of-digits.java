class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int digit = 0;
            int n = nums[i];
            while(n!=0){
                int rem = n%10;
                digit = digit+1;
                n = n/10;
            }
            if(digit%2==0)
                count++;
        }
        return count;
    }
}