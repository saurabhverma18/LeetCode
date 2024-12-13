class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        double len=salary.length;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max)
            {
                max=salary[i];
            }
            if(salary[i]<min)
            {
                min=salary[i];
            }
        }
        for(int i=0;i<salary.length;i++)
     {
         if(salary[i]==max || salary[i]==min)
         continue;
         else
         sum+=salary[i];
     }
     
      double avg=sum/(len-2);
      return avg;
    }
    
}