class Solution {
    public int countTriples(int n) {
        int i=1,j,k,c=0;
        while(i<=n){
            for(j=1;j<=n;j++){
                if(j!=i){
                for(k=1;k<=n;k++){
                    if(k!=j&&k!=i){
                    if(Math.pow(i,2)+Math.pow(j,2)==Math.pow(k,2)){
                        c++;
                    }
                    }
                }
                }
            }
            i++;
        }
        return c;
    }
}