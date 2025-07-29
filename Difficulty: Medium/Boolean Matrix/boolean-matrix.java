class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        boolean rowFlag=false;
        boolean colFlag=false;
        for(int i=0;i<m;i++){
            if(mat[i][0]==1){
                colFlag=true;
                break;
            }
        }
        for(int j=0;j<n;j++){
            if(mat[0][j]==1){
                rowFlag=true;
                break;
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==1){
                    mat[i][0]=1;
                    mat[0][j]=1;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][0]==1||mat[0][j]==1){
                    mat[i][j]=1;
                }
            }
        }
        if(rowFlag){
            for(int j=0;j<n;j++){
                mat[0][j]=1;
            }
        }
        if(colFlag){
            for(int i=0;i<m;i++){
                mat[i][0]=1;
                
            }
        }
        
    }
}