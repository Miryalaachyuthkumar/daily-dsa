class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> sta = new Stack<>();
        String st = "";
       
        for(char x : s.toCharArray() )
        {   
            if(x != '(' && x !=')')
            { 
                st+=x;
            }
            
            if(x == '(')
            {   sta.push(x);
                st+=x;
                
            }
            if(x == ')')
            {
                if(sta.isEmpty())
                {
                    continue;
                }
                st+=x;
                    sta.pop();
            }

        }
        if(sta.isEmpty())
        {
        return st;
        }
        else
        {
            while(!sta.isEmpty())
            {
                int index = st.lastIndexOf("(");
                st = st.substring(0, index) + st.substring(index + 1);
                sta.pop();
            }
        }
        return st;
    }
}