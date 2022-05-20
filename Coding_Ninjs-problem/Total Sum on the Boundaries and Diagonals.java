public class Solution { 
    private static int getFirstDiagonalSum(int[][] mat, int dimension) { 
        int currRow = 0; 
        int currCol = 0; 
        int diagonalSum = 0; 
        while (currRow < dimension && currCol < dimension) { 
            diagonalSum += mat[currRow][currCol]; 
            currRow += 1;
            currCol += 1; 
        } 
        return diagonalSum; 
    } 
    
    private static int getSecodDiagonalSum(int[][] mat, int dimension) { 
        int currRow = 0;
        int currCol = dimension - 1;
        int diagonalSum = 0; 
        while (currRow < dimension && currCol >= 0 ) { 
            diagonalSum += mat[currRow][currCol];
            currRow += 1; currCol -= 1; 
        } 
        return diagonalSum;
    } 
    
    private static int getBoundarySum(int[][] mat, int dimension) {
        int sum = 0; 
        for (int i = 1; i < (dimension - 1); i++) {
            sum += mat[0][i];
            //Upper side
            sum += mat[dimension - 1][i];
            //Lower side 
            sum += mat[i][0];
            //Left side
            sum += mat[i][dimension - 1]; 
            //Right side 
        } 
        return sum; 
    } 
    public static void totalSum(int[][] mat) {
        int n = mat.length; if (n == 0) { 
            System.out.println(0); 
            return;
        }
        int totalSum = getFirstDiagonalSum(mat, n) + getSecodDiagonalSum(mat, n) + getBoundarySum(mat, n);
        if (n % 2 != 0 ) { 
            totalSum -= mat[n / 2][n / 2]; 
        } 
        System.out.println(totalSum); 
    }
}