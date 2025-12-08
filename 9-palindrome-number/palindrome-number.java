class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,tmp=x,rem;
        while(tmp>0){
            rem=tmp%10;
            rev=rev*10+rem;
            tmp=tmp/10;
        }
        if(rev==x)
            return true;
        else
            return false;
    }
}