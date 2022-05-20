public class Solution {  

    public static void rotate(int[] arr, int d) {
        int[] temp=arr.clone();
      
        // for(int i=0;i<arr.length;i++){
        //     temp[i]=arr[i];
        // }
        int k=0;
    	for(int i=d;i<arr.length;i++){
           arr[k]=temp[i];
            k++;
        }
      
        for(int i=0;i<d;i++){
            arr[k]=temp[i];
            k++;
        }
    }

}