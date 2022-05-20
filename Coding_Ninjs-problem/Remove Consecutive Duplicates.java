
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String s  = "";
        char prevChar = ' ';
        for (int i=0; i<str.length(); i++){
            if (prevChar != str.charAt(i)){
                s = s + str.charAt(i);
            }
            prevChar = str.charAt(i);  
        }
        return s;
	}

}