class Solution {
    public int removeDuplicates(int[] nums) {
        
    
       int k=1;
        int ex[]=new int[nums.length];
        




        
        ex[0]=nums[0];  
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                ex[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<ex.length;i++)
        {
            nums[i]=ex[i];
        }
        
        return k;
 
   }   }