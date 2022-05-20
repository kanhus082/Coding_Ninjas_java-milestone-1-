import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		// Write your code here		

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n+1-i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= (i-1)*2; j++){
                System.out.print("*");
            }
            for(int j = n-i+1; j >= 1; j--){
                System.out.print(j);
            }
                System.out.println();
        }
	}
}