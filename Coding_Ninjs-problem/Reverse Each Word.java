public class Solution {

    // Return the reversed string. No need to print
    public static String reverseEachWord(String str) {
        // Write your code here
        int n = str.length();
        int previousSpaceIndex = -1;
        String ans = "";
        int i = 0;
        for(;i<n;i++){
            if(str.charAt(i)==' '){
                ans += (reverseWord(str,previousSpaceIndex +1,i)+" ");
                previousSpaceIndex = i;
            }
        }
        ans += (reverseWord(str,previousSpaceIndex+1,i)+" ");
        return ans;


    }

    private static String reverseWord(String str, int start, int end ){

        String reverse = "";
        while(start<end){
            reverse = str.charAt(start)+reverse;
            ++start;
        }
        return reverse;
    }
}

