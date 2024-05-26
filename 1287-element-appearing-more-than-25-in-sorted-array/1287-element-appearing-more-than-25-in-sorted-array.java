class Solution {
    public int findSpecialInteger(int[] arr) {
        int m=1;
        if(arr.length==1)
        {
            return m;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                m++;
                if(m>arr.length/4)
                {
                    return arr[i];
                }
            }
            else
            m=1;
        }
        return 0;
        
    }
}