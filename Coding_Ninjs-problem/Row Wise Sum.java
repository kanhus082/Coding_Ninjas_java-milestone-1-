
public class Solution {

    public static void rowWiseSum(int[][] mat) {
        int rows=mat.length;
        if(mat.length==0){
            return;
        }
        int cols=mat[1].length;

        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
                sum=sum+mat[i][j];
            }
            System.out.print(sum +" ");

        }
    }

}
