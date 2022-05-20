import java.util.*;
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int n = arr.length;
        if(n%2==0){
            for(int i = 0; i < arr.length; i+=2){
            	int temp = arr[i];
            	arr[i] = arr[i+1];
            	arr[i+1] = temp;
        	}
        }else{
            for(int i = 0; i < arr.length-1; i+=2){
            	int temp = arr[i];
            	arr[i] = arr[i+1];
            	arr[i+1] = temp;
        	}
        }
            
    }
}
