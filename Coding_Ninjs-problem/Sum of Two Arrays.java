public class Solution {
	/*public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		int ans[] = new int[Math.max(n, m)];
		int carry = 0;
		int sum = 0;
		int k = ans.length - 1;
		int i = n - 1;
        int j = m - 1;
        
		while (i >= 0 || j >= 0) {
			sum = 0;
            
            // If we have some elements left in the first array, then add it to the sum.
			if (i >= 0) {
				sum += a[i];
				i--;
			}
            
            // If we have some elements left in the second array, then add it to the sum.
			if (j >= 0) {
				sum += b[j];
				j--;
			}
            
			sum += carry;
			int lastDigit = sum % 10;
			carry = sum / 10;
			ans[k--] = lastDigit;
		}
        
        // If still some carry is left, then push it to the answer.
		if (carry != 0) {
			int[] newAns = new int[ans.length + 1];
			newAns[0] = carry;
            
			for (int p = 1; p < newAns.length; p++) {
				newAns[p] = ans[p - 1];
			}
			return newAns;
		}
		return ans;*/
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]){
         int n=arr1.length;
        int t=arr2.length;
    	int i = arr1.length-1;
        int j = arr2.length-1;
        int k = output.length-1;
        int carry = 0;
        while(k>=0){
            int digit= carry;
            if(i>=0){
                digit +=arr1[i];
            }
            if(j>= 0){
                digit += arr2[j];
            }
            carry = digit/10;
            digit = digit%10;

            output[k] = digit;

            i--;
            j--;
            k--;
        }
    
	}

}