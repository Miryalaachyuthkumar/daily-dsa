class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j)
        {  int mid = (i+j)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[i] == target)
            {
                
                return i;
            }
            else
            {
                i++;
            }
            if(nums[j] == target)
            {
                return j;
            }
            else
            {
                j--;
            }
        }
        return -1;
    }
}