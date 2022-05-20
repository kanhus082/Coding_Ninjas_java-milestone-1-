import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // int n1 = n;
        // int c = 0;
        // while(n1 != 0){
        //     c++;
        //     n1/=10;
        // }
        
        int ans = 0;
        int i = 0;
        while(n > 0){
            int r = n%10;
            ans += r*Math.pow(2,i);
            n /= 10;
            i++;
        }
        System.out.println(ans);        
	}
}