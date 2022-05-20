public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
         int totalsum=0;
        for(int i=0; i<arr.length-1;i++){
            totalsum=totalsum+arr[i];
        }
        int ls=0;
        int rs=0;
        int i=0;
        while(i<arr.length){
         rs=totalsum-ls-arr[i];
        if(ls==rs){
            return i;
        }
        else{
            ls= ls+arr[i];
             i++;}
        }
        return -1;
        
	}
}