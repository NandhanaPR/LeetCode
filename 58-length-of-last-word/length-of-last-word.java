class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=s.length()-1;
        int c=0;

        for(;i>=0;i--){
            if(s.charAt(i)==' '){
            return c;
            }
            c++;
        }
        return c;
    }
}