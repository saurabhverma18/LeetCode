class Solution {
    public int addDigits(int num) {
       int s= sum(num);
        if(s/10==0)
        {
            return s;
        }
        else{
           do{
               s= sum(s);
           }while(s/10!=0);
        }
        return s;
    }
    public int sum(int num)
    {
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}