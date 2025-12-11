class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        double s1;
        int n=nums1.length;
        int m=nums2.length;
        int nums3[]= new int[n+m];
        while(i<n&&j<m){
            if(nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                k++;i++;
            }
            else if(nums1[i]>nums2[j]){
                nums3[k]=nums2[j];
                k++;j++;
            }
        }
        while(i<n){
            nums3[k]=nums1[i];
            k++;i++;
        }
        while(j<m){
            nums3[k]=nums2[j];
            k++;j++;
        }
        if((n+m)%2==0){
            s1=(nums3[((n+m)/2)-1]+nums3[(n+m)/2])/2.0;
        }else{
            s1=nums3[(n+m)/2];
        }
        return s1;
    }
}