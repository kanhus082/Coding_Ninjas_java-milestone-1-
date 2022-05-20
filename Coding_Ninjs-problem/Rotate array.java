public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        int[] arr1=new int[n];
        //arr1=arr;
        int temp=0;
      	 	int  count=0;
    	 	int i=0;
        int j=0;
        int k=0;
        	int num=d;
        	while(d>0){
                arr1[j]=arr[j];
                //temp++;
                j++;
                d--;
            }
        
        	while(num<n){
            arr[count]=arr[num];
            num++;
            count++;
        	}
        	while(count<n){
                arr[count]=arr1[k];
                k++;
                count++;
            }
            
   		 
        
      }

}
