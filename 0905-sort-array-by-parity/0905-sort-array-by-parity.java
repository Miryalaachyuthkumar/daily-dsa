class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        Arrays.sort(nums);
        int n = nums.length;
        int a[] = new int[n];
        for(int k = 0;k<n;k++)
        {
               if(i>j)
               {
                break;
               }
             
                if(nums[k]%2 == 0)
                {
                    a[i++] = nums[k];
                    
                }else
                {
                    a[j--] = nums[k];
                     
                }
             
        }
        return a;
    }
}