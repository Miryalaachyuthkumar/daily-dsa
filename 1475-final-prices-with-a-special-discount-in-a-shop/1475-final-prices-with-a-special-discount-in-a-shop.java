class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while(!st.empty()&&st.peek()>prices[i])
            {
                st.pop();
            }
            ans[i] = st.empty()?prices[i]:prices[i]-st.peek();
            st.push(prices[i]);
        }
        return ans;
    }
}