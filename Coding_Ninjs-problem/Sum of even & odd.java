import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfEven=0;
        int sumOfOdd=0;
        while(n>0){
            int r = n%10;
            if(r%2 == 0){
                sumOfEven += r; 
            }else{
                sumOfOdd += r;
            }
            n /= 10;
        }
        System.out.println(sumOfEven+" "+sumOfOdd);
	}
}