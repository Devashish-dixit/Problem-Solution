class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int i;
        int N = nums1.length+nums2.length;
        int arr[] = new int[N];
        for(i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }

        for(int j=0;j<nums2.length;j++)
        {
            arr[i+j]=nums2[j];
        }
        Arrays.sort(arr);
        if(N%2==0)
        {
           result = (double)(arr[N/2]+arr[(N/2)-1])/2;
        }
        else
        {
            result = (double)arr[N/2];
        }
        return result;
    }
}