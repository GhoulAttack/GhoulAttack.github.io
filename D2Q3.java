class Solution {
    public int[][] generateMatrix(int n) {
         int top=0;
         int bottom=n-1;
         int left=0;
         int right=n-1;
         int i=1;
         int [][]ans=new int[n][n];
         while(i<=n*n){
             for(int k=left;k<=right;++k,++i){
                 ans[top][k]=i;
             }
            ++top;
             for(int k=top;k<=bottom;++k,++i){
                 ans[k][right]=i;
             }
            --right;
             for(int k=right;k>=left;--k,++i){
                 ans[bottom][k]=i;
             }
            --bottom;
             for(int k=bottom;k>=top;--k,++i){
                 ans[k][left]=i;
             }
            ++left;
         }
         return ans;

    }
}
