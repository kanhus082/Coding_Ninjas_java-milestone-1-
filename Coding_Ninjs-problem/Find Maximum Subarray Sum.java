
import java.util.*;
public class Solution {
    public static int maxSubArray(int[] arr,int n, int k) {
        if (n == 0 || n <= k) {
                return 1;
            }
     
        int res = 0;
        for (int i=0; i<k; i++)
           res += arr[i];
        int curr_sum = res;
        for (int i=k; i<n; i++){
           curr_sum += arr[i] - arr[i-k];
           res = Math.max(res, curr_sum);
        }
      
        return res;
    }
	
    
    public static void main(String[] args) {
		// Write your code here
        Scanner s =new Scanner(System.in);
		int n= s.nextInt();
        int k= s.nextInt();
        int arr[] = new int[n];
        for(int i= 0; i< n; i++){
            arr[i]=s.nextInt();
        }
		System.out.print(maxSubArray(arr, n, k));
        
    }
 }
