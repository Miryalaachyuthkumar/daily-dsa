class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int fi = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++)
        {
            int l = i+1;
            int r = nums.length-1;
            while(l<r)
            {
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == target)
                {
                    return sum;
                }
                
                int re = Math.abs(sum - target);
                if(sum>target)
                {
                    r--;
                }
                if(sum<target)
                {
                    l++;
                }
                if(re<min)
                {
                     fi = sum;
                    min = re;
                }


            }
        }
        return fi;
    }
}