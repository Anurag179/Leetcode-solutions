class Solution {
    public double myPow(double x, int n) {
        if(n<=0){
            return (1/ans(x,n*-1));
        }else{
            return ans(x,n);
        }
    }

    private double ans(double x, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n%2==0){
            double res = ans(x,n/2);
            return res * res;
        }else{
            double res = ans(x,n/2);
            return res * res * x;
        }
    }
}