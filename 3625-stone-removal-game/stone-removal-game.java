class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        int m=n; int count=0;
        while(m>=i){
            m=m-i;
            i--;
            count++;
        }
         if(count%2==0&&i>m)
        {
            return false;}
         else if(m>10) {
            canAliceWin(m);
        }
        
        
        else{
            return true;
        }
   return true; }}