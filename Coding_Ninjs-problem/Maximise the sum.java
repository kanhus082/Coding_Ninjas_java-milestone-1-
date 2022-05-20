public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
	int m = input1.length,n = input2.length;
       int i =0;
       int j = 0;
       long results = 0,sum1 =0, sum2 =0;
       while(i<m && j<n){
           if(input1[i] < input2[j]){
               sum1 += input1[i++];
           }
           else if(input1[i] > input2[j]){
               sum2 += input2[j++];
           }
           else{
               results += Math.max(sum1,sum2);
               sum1 =0;
               sum2 = 0;
               
               while(i <m && j <n && input1[i] == input2[j]){
                   results += input1[i++];
                   j++;
               }
           }
       }
       
       while(i < m){
           sum1 += input1[i++];
       }
       while(j < n){
           sum2 += input2[j++];
       }
       results += Math.max(sum1,sum2);
       return results;
	}
}

