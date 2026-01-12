class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;

        long nn = Math.abs((long)n);

        while(nn!=0){
            if(nn%2 == 0){
                x = x*x;
                nn/=2;
            }
            else{
                ans = ans*x;
                nn-=1;
            }
        }
        return (n>=0)?ans:(1/ans);
        
    }
}