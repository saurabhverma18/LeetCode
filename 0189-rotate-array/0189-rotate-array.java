class Solution {
    public static void revarr(int arr[], int sIdx, int eIdx)
    {
        
        while(sIdx<eIdx)
        {
            int temp=arr[sIdx];
            arr[sIdx]=arr[eIdx];
            arr[eIdx]=temp;
            sIdx++;
            eIdx--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;

        revarr(nums,0,nums.length-1);

        revarr(nums,0,k-1);

        revarr(nums,k,nums.length-1);
       
        
    }
}
