public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        
        char ans = ' ';
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++){
            int x = str.charAt(i);
            arr[x]++;
        }
        int ansCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > ansCount){
                ans = (char) i;
                ansCount = arr[i];
            }
        }
        return ans;
	}

}
