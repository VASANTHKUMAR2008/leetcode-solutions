class Solution {
    public int fib(int n) {
        int i=2;
        int r=0;
        int d=1;
        while(i<=n)
        { int c=r+d;
        r=d;
        d=c;
        i++;
        }
          if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
    return d;
    }
}