class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int arr[] = new int[n1+n2];

        for(int i=0;i<n1;i++){
            arr[i] = nums1[i];
        }

        for(int i=0;i<n2;i++){
            arr[n1+i] = nums2[i];
        }

        Arrays.sort(arr);

        int n = arr.length;

        if(n%2!=0)
            return arr[n/2];
        else
            return (arr[n/2-1]+arr[n/2]) / 2.0;
    }
}