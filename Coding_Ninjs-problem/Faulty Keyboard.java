import java.util.*;
public class Solution {
    public static void main(String[] args) {
		// Write your code here
        Scanner s =new Scanner(System.in);
		String n = s.next();
       	String m = s.next();
     	
        boolean ans = true;
        // for(int i = 0; i < n.length(); i++){
        //     int k = 0;
        //     for(int j = 0; j < m.length(); j++){
        //         if(n.charAt(i) == m.charAt(j)){
        //             k =
        //         }
        //     }
        // }
        
        // int i = 0;
        // int j = 0;
        // while(i < n.length() && j < m.length){
        //     if(n.charAt(i) == m.charAt(j)){
        //         i++;
        //         j++;
        //     }
        // }
        
        String value1 = n.toLowerCase();
        String value2 = m.toLowerCase();
        for (int i = 0; i < value2.length(); i++) {
            if (value1.indexOf(value2.charAt(i)) != -1)
                ans = false;
            else
                ans = true;
        }
        // ans = false;
        System.out.println(ans);
    }
}
