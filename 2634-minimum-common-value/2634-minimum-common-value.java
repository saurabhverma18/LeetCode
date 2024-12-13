class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min=Integer.MAX_VALUE;
        int ptr1=0;
        int ptr2=0;
        while(ptr1<=nums1.length-1 && ptr2<=nums2.length-1){
            if(nums1[ptr1]==nums2[ptr2]){
                if(nums1[ptr1]<min){
                    min=nums1[ptr1];
                }
                    ptr1++;
                    ptr2++;
                }
            

            else if(nums1[ptr1]<nums2[ptr2]){
                ptr1++;
            }

            else{
                ptr2++;
            }

        }
        return min==Integer.MAX_VALUE? -1 : min;
    }
}