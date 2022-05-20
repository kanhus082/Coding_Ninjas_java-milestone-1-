public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
            	if(arr[i] + arr[j] == 2*arr[i]){
                	a = arr[i];
                    break;
                }
        	}
        }
        return a;
    }
}
