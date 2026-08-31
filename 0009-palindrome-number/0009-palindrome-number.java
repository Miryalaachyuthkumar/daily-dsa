class Solution {
    public boolean isPalindrome(int x) {
        int  num = 0;
        int g = x;
        while(x>0)
        {
            num = (num*10)+x%10;
            x = x/10;

        }
        if(num==g)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}