class Solution {
    public int[] resultArray(int[] nums) {
         int n = nums.length;
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        int i = 0;
        int j = 0;
        
        arr1[i] = nums[0];
        arr2[j] = nums[1];
        
        for (int k = 2; k < n; k++) {
            
            if (arr1[i] > arr2[j]) {
                arr1[++i] = nums[k];
            } else {
                arr2[++j] = nums[k];
            }
        }
        
        // Add arr2 elements after arr1
        for (int k = 0; k <= j; k++) {
            arr1[++i] = arr2[k];
        }
        
        return arr1;
    }
}