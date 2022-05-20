public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	
        
     	int answer = 0;
        
        for(int i = 1; i<arr.length; i++){
            
            if(arr[i] < arr[i-1]){
                answer = i;
                break;
            }
            
        }
        
        return answer;
        
    }

}