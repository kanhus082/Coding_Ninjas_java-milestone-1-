
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		 int i,j,k;
		
		     for(i=1;i<=n;i++)
		     {
		 k=i;
		         for(j=1;j<=i;j++,k++)
		         { 
		             System.out.print((char)(k+64));
		         } 
		         System.out.println("");
		     }
		
	}

}
