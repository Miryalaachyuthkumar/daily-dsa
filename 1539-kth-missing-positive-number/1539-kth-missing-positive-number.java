class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 1;i<=10000;i++)
        {
            set.add(i);
        }
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            set.remove(arr[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        int ans = list.get(k-1);
        return ans;

    }
}