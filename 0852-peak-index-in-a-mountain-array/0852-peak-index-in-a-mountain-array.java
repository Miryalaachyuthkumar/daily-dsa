class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int n = arr.length;
        int r = n-1;
        while(l<r)
        {
            int mid = l + (r-l)/2;
            if(arr[mid+1]<arr[mid])
            {
                r = mid;
            }
            else
            {
                l = mid+1;
            }
        }
        return l;
    }
}