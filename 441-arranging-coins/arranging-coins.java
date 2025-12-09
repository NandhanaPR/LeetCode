class Solution {
    public int arrangeCoins(int n) {
        int c=n,i;
        for(i=1;c>=0;i++){
            c=c-i;
        }
        return i-2;
    }
}