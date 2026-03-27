class Solution {
    public int heightChecker(int[] heights) {
       
        int nums1[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
           nums1[i]=heights[i];
        }
         Arrays.sort(heights);
        int count=0;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}