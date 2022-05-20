import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
            for (int j = 4; j >= i; j--)
                System.out.print("");
            for (int k = i; k >= 1; k--)
                System.out.print(k);
            System.out.println();
        }
		
	}

}
