class Solution {
    public static void markrow(int matrix[][],int i){
        for(int j=0;j<matrix[0].length;j++){
           if (matrix[i][j]!=0){
                matrix[i][j]=-1000;
            }
        }
    }
    public static void markcol(int matrix[][],int j){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1000;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    markrow(matrix,i);
                    markcol(matrix,j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1000){
                    matrix[i][j]=0;
                }
            }
        }
    }
}