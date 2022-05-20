public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String rS= "";
        int start =0;
        for(int i =0;i<input.length();i++){
            if(i==input.length()-1){
                int end=i;
                rS= input.substring(start,end+1)+rS;
                return rS;
            }
            
            if(input.charAt(i)==' '){
                int end= i-1;
                rS=" " +input.substring(start,end+1)+rS;
                start=i+1;
            }
            
        }
        
        return rS;

	}
}

