import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		
		int  i,j;
		for(i = 1; i <= n; i++)
		{
		    for(j = 1; j <= i; j++)  
		    {          
		        System.out.print(i); 
		    }      
		    System.out.print("\n");        
		}
		
	}

}
