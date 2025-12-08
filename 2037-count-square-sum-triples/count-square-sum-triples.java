class Solution {
    public int countTriples(int n) {
        int i=1,c=0;
        while(i<=n){
            for(int j=1;j<=n;j++){
                int t=(int)Math.sqrt(i*i+j*j);
                if(t<=n&&t!=i&&t!=j&&i!=j&&t*t==i*i+j*j){
                    c++;
                }
            }
            i++;
        }
        return c;
    }
}