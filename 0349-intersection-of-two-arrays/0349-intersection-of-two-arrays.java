import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==1 && nums2.length==1 && nums1[0]==nums2[0]){
            return nums1;
        }
         if(nums1.length==0 && nums2.length==0){
             if(nums1.length==0)
             return nums1;
             else
             return nums2;
         }
        Arrays.sort(nums2);
        Arrays.sort(nums1);
     if(nums2.length<=nums1.length){
         int arr[]=new int[nums2.length];
         int j=0;
         int k=0;
         for(int i=0;i<nums2.length;){
            if(j==nums1.length)
            break;

             if(nums1[j]==nums2[i] && (k==0 || arr[k-1]!=nums1[j])){
                 arr[k]=nums1[j];
                 i++;
                 k++;
                 j++;
               
                 
             }
             else if(nums1[j]<nums2[i]){
                 j++;
             }
             else{
                 
                 i++;
             }
         }
         return Arrays.copyOf(arr,k); 
     }
     else{
           int arr[]=new int[nums1.length];
         int j=0;
         int k=0;
         for(int i=0;i<nums1.length;){
             if(j==nums2.length)
             {
                 break;
             }
             if(nums2[j]==nums1[i] && (k==0 || arr[k-1]!=nums2[j])){
                 arr[k]=nums2[j];
                 i++;
                 k++;
                 j++;
               
                 
             }
             else if(nums2[j]>nums1[i]){
                 i++;
             }
             else
             j++;

            
         }
         return Arrays.copyOf(arr, k); 

     }
    }

       
    
}