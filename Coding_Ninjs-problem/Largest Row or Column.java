import java.util.Scanner;
public class Solution {
//private static final practice1 LargestRoworColumn = null;


	public static void findLargest(int input[][]) {
                		int largestSum=Integer.MIN_VALUE;
        int num=0;
        int nRows=input.length;
        if(nRows==0){
            System.out.println("row "+num+" "+largestSum);
        return;
        }

		int m=input.length;
		  int n=input[0].length;
		  int max = Integer.MIN_VALUE;
		  int q = 0;
		  String s = "";
		  for(int i=0; i<m; i++)
		  {
		    int sum=0;
		    for(int j=0; j<n; j++)
		    {
		      sum =sum +input[i][j];

		    }
		    if(sum>max){
		      max = sum;
		      q = i;
		      s = "row";
		    }
		  }
		  for(int i=0; i<n; i++)
		  {
		   int sum=0;
		    for(int j=0; j<m; j++)
		    {
		      sum=sum +input[j][i];

		    }
		  if(sum>max){
		    max = sum;
		    q = i;
		    s = "column";
		  } 
		  }
		  System.out.println(s + " "  + q + " " + max);
		}
	
	
	
	
// static Scanner s = new Scanner(System.in);
	
	
// 	public static int[][] takeInput2D(){
		
// 		int numRows = s.nextInt();
// 		int numCols = s.nextInt();
// 		int[][] input = new int[numRows][numCols];
// 		for(int i = 0; i < numRows; i++){
// 			for(int j = 0; j < numCols; j++){
// 				input[i][j] = s.nextInt();
// 			}
// 		}
// 		return input;
// 	}
	
	
// 	public static void main(String[] args) {
	
// 		int input[][] = takeInput2D();
// 		LargestRoworColumn.findLargest(input);
		
// 	}

}
