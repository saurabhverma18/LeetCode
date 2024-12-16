class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while(k>0){
            int smallest=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[smallest]){
                    smallest=i;
                }
            }
            nums[smallest]=nums[smallest]*multiplier;
            k--;
        }
        return nums;
        
    }
}