class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int tested=0;
        for(int i=0;i<batteryPercentages.length;i++)
        {
            if(batteryPercentages[i]==0)
            {
                continue;
            }
            if(batteryPercentages[i]>0)
            {
                tested++;
                for(int j=i+1;j<batteryPercentages.length;j++)
                {
                    batteryPercentages[j]=batteryPercentages[j]-1;
                }
            }
        }
        return tested;
    }
}