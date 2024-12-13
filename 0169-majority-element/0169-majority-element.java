
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        int c=(nums.length/2);
        int i=0;
        while(c>0)
        {
            if(nums[i]==nums[i+1])
            {
                c--;
            }
            else{
                c=nums.length/2;
            }
            i++;
        }
        return nums[i];
        
    }
}