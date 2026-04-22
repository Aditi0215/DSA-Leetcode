class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        int[] stack = new int[n]; // manual stack (stores indices)
        int top = -1;

        for (int i = 0; i < n; i++) {

            while (top != -1 && temperatures[i] > temperatures[stack[top]]) {
                int prevIndex = stack[top--];  // pop
                ans[prevIndex] = i - prevIndex;
            }

            stack[++top] = i; // push
        }

        return ans;
    }
}