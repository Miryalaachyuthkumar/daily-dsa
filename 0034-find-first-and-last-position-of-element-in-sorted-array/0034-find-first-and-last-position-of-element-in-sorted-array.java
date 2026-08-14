class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = {-1,-1};
        int l = 0;
        int n = nums.length;
        int r = n-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(nums[mid] == target)
            {
                a[0] = mid;
                r = mid-1;
            }
            else if(nums[mid]<target)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        int r1 = n-1;
        int l1 = 0;
        while(l1<=r1)
        {
            int mid1 = l1+(r1-l1)/2;
            if(nums[mid1] == target)
            {
                a[1] = mid1;
                l1 = mid1+1;
            }
            else if(nums[mid1]<target)
            {
                l1 = mid1+1;
            }
            else
            {
                r1 = mid1-1;
            }
        }
        return a;
    }
}