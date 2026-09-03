class Solution {
    public boolean uniformArray(int[] nums1) {
        int od = Integer.MAX_VALUE;
        for(int x : nums1)
        {
             if(x%2 != 0)
             {
                if(od>x)
                {
                    od = x;
                }
             }
        }
        if(od == Integer.MAX_VALUE)
        {
            od = 0;
        }
        for(int x : nums1)
        {
            if(x<od)
            {
                return false;
            }
        }
        return true;
    }
}