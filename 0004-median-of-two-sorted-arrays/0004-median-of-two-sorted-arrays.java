class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m=nums1.length;
      int n=nums2.length;
        int arr[]=new int[m+n];
        
        for(int i=0;i<m;i++)
        {
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[m]=nums2[i];
            m++;
        }
        Arrays.sort(arr);
        if((arr.length-1)%2==0)
        {
            return arr[((arr.length-1)/2)];
        }
       else
       {
           int p= (arr.length-1)/2;
           return ((double)(arr[p]+arr[p+1])/2);
       }
        
    }
}