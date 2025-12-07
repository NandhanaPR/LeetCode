class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,k=0;
        int []arr;
        arr = new int[2];
        for(i=0;i<nums.length;i++){
            int temp=target-nums[i];
            for(j=0;j<nums.length;j++){
                if(nums[j]==temp&&j!=i){
                    arr[k]=i;
                    arr[k+1]=j;
                    return arr;
                }
            }
        }
    return arr;
    }
}