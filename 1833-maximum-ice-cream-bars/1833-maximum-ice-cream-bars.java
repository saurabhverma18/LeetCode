class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        
        int n=costs.length;
        int i=0;
        Arrays.sort(costs);
        while(i<n)
        {
           if(coins>=costs[i])
           {
               coins-=costs[i];
               max++;
           }
           i++;
        }
        return max;
        
    }
}