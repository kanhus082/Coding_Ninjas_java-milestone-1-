import java.util.Scanner;
public class Solution {

	
     public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
				
		while(start <= end) {
            System.out.println(start +" "+(start - 32)*5/9);
            start += step;
        }
	}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        printFahrenheitTable(s, e, w);
    }
}