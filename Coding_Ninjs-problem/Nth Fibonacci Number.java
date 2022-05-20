import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
int n,i,a=0,b=1,c=1;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        for(i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
		System.out.println(c);
	}

}
