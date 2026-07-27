class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    int res = (nums[i]-1)*(nums[j]-1);
                    if(res>max){
                        max = res;
                    }
                }
            }
        }
        return max;
    }
}