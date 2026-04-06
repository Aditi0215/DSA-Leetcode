class Solution {
    public int minimumCost(int[] cost) {
         Arrays.sort(cost); // ascending

        int total = 0;
        int n = cost.length;

        // traverse from end (largest values)
        for(int i = n - 1; i >= 0; i -= 3) {
            total += cost[i]; // most expensive
            if(i - 1 >= 0) {
                total += cost[i - 1]; // second expensive
            }
            // skip i-2 (free candy)
        }

        return total;
    }
}