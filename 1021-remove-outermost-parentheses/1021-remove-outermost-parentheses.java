class Solution {
    public String removeOuterParentheses(String s) {
         int c = 0;
         StringBuilder sb = new StringBuilder();
         for(char x : s.toCharArray())
         { 
            if(x == '(')
            {
              if(c>0)
              {
                sb.append(x);
              }
              c++;
            }
            else
            {
                c--;
                if(c>0)
                {
                    sb.append(x);
                }
            }
         }
         return sb.toString();
    }
}