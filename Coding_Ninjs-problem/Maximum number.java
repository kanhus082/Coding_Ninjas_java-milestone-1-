import java.util.Scanner;
public class Solution {
    
    public static int max_number(int n){
                
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */

        
        for (int j = 0; j < 1; j++) {
 
            int ans = 0;
            int i = 1;

            while (n / i > 0) {

                int temp = (n / (i * 10)) * i + (n % i);
                i *= 10;
                ans = Math.max(ans, temp);
            }
            n = ans;
        }
        return n;
    }
    

}
