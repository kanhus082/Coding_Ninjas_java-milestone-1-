public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int rs = 0;
		int re = matrix.length - 1;
		int cs = 0;
        if(matrix.length==0)
        {
            return;
        }
		int ce = matrix[0].length - 1;
		int i,j,c = 1;
		
		while(c <= (matrix.length*matrix[0].length)) {
			for(j = cs;j <= ce;j++) {
				System.out.print(matrix[rs][j] + " ");
				c++;
			}
			rs++;
			for(i = rs;i <= re;i++) {
				System.out.print(matrix[i][ce] + " ");
				c++;
			}
			ce--;
			for(j = ce ;j >= cs ;j--) {
				System.out.print(matrix[re][j] + " ");
				c++;
			}
			re--;
			for(i = re;i >= rs;i--) {
				System.out.print(matrix[i][cs] + " ");
				c++;
			}
			cs++;
	
		}
	}
}