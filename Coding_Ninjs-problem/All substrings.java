
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
          for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.println(str.substring(j,i+1));
            }
        }
	}

}
