class Solution {
    public int singleNumber(int[] nums) {
        int f,a=0;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            f=0;
            for(int j=0;j<nums.length;j++){
                if(a==nums[j]&&i!=j){
                    f=1;
                    break;
                }
            }
            if(f==0){
                break;
            }       
        }
        return a;
    }
}