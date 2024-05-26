class Solution {

    public int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            product*=-1;
            if(nums[i]==0)
            product=0;
        }
        if(product>0)
        return 1;

        else if(product<0)
        return -1;

        else
        return 0;
        
    }
}