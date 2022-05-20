import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int r=n;r>=1;r--)
		{
		for(int c=1;c<=r;c++)
		{
		System.out.print(r);
		}
		System.out.println();
		}

		
	}

}
