class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }

        int arr[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=arr[nums[i]]+1;
        }
        max=Integer.MIN_VALUE;
        int maxFreq=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
            {
                maxFreq+=arr[i];
            }
        }
        return maxFreq;
    }
}