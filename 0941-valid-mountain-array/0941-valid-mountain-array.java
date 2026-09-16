class Solution {
    public boolean validMountainArray(int[] arr) {
      int n = arr.length;
      if(n<3)
      {
        return false;
      }
      int x = 0;
      int key = -1;
      for(int i = 0;i<n-1;i++)
      {
        if(arr[i] == arr[i+1])
        {
            return false;
        }
      }
      for(int i = 0;i<n-1;i++)
      {
         if(arr[i]>arr[i+1])
         {
             key = arr[i];
             x = i;
             break;
         }
      }
      if (x == 0 || key == -1) { 
        return false; 
        }
      for(int i = x+1;i<n;i++)
      {
        if(key<=arr[i])
        {
            return false;
        }
        key = arr[i];
      }
     return true;
    }
}