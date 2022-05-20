import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        
        int i = 1;
        int ans = 1;
        while(i <= p){
            ans = ans*n;
            i++;
        }
        System.out.print(ans);        
    }
}