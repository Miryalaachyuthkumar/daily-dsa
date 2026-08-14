class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        double r;
        int [] c = new int [n];
        System.arraycopy(nums1,0,c,0,nums1.length);
        System.arraycopy(nums2,0,c,nums1.length,nums2.length);
        Arrays.sort(c);
         int mid = n/2;
        if(n%2 == 0)
        {
            
            r = (c[mid]+c[mid-1])/2.0;

        }
        else{
            r = (c[mid]);
        }
        return r;
    }
}