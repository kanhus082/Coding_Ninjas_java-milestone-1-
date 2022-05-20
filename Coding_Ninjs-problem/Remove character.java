
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		int n = str.length();
        String ans = "";
        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }
        return ans;
	}

}
