class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k = 0;
        int ans[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++)
        {
            boolean flag = false;
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    flag = true;
                    break;
                }
            }

            if(flag)
            {
                boolean found = false;

                for(int j = 0; j < k; j++)
                {
                    if(ans[j] == nums1[i])
                    {
                        found = true;
                        break;
                    }
                }

                if(!found)
                {
                    ans[k++] = nums1[i];
                }
            }
        }

        int result[] = new int[k];

        for(int i = 0; i < k; i++)
        {
            result[i] = ans[i];
        }

        return result;
    }
}