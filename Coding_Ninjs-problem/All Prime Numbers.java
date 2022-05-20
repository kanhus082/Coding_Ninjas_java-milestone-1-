import java.util.Scanner;

public class Solution {
public static void main(String args[]){
	int n,i,j,c;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
               
            }
             if(c==2)
                {
                    System.out.println(i);
                }
        }   
}
}

