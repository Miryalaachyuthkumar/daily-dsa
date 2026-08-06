class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        
        int n = temperatures.length;
        for(int i = n-1;i>=0;i--)
        {
            while(!st.empty() && temperatures[st.peek()]<=temperatures[i])
            {
                st.pop();
            }
            
            ans[i] = st.empty()?0:st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}