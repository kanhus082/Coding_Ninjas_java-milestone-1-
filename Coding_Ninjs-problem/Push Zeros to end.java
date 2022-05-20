public class Solution {
	
	public static void pushZerosAtEnd(int[] arr){
		int j = 0;
        int n = arr.length;
            for(int i=0;i<n;i++){
                if(arr[i] != 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                        j++;
                }
            }
        }

	}
