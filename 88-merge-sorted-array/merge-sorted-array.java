class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m+n;

        for(int i=m,j=0;i<l;i++,j++)
        {
            nums1[m++] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}