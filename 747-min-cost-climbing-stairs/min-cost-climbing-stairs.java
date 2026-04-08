class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int num1 = cost[0];
        int num2 = cost[1];

        for(int i=2;i<n;i++){
            int result = cost[i]+Math.min(num1,num2);
            num1 = num2;
            num2 = result;
        }
        return Math.min(num1,num2);
    }
}