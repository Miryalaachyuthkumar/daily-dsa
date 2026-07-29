class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int x  : asteroids)
        {
            if(x>0)
            {
                st.push(x);
            }
            if(x<0)
            {
                while( !st.isEmpty()&& st.peek()>0&&st.peek()<Math.abs(x))
                {
                    st.pop();
                }
                    if(st.isEmpty()||st.peek()<0)
                    {
                        st.push(x);
                        
                    }
                    else if(st.peek() == Math.abs(x))
                    {
                        st.pop();
                        
                    }
                
            }
        }
        int ans[] = new int[st.size()];
        int i = 0;
        for(int x : st)
        {
            ans[i++] = x;
        }
        return ans;
    }
}