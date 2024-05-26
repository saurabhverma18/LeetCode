class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            sum+=rem;
            prod*=rem;
        }
        return prod-sum;
    }
}