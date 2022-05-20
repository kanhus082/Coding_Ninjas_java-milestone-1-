public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
    	
        int val = 1;
        int s = 0;
        int e = n-1;
        if(n%2 == 0){
            while(val < n){
            	arr[s] = val;
            	val++;
            	s++;
           		arr[e] = val;
            	val++;
            	e--;
        	}
        }else{
        	while(val <= n){
            	arr[s] = val;
            	val++;
            	s++;
                if(val > n)
                    break;
           		arr[e] = val;
            	val++;
            	e--;
        	}   
        }
        
    }
}
