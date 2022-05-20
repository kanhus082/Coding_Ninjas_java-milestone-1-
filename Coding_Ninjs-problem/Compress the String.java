public class Solution {

	public static String getCompressedString(String str) {
         String s2=new String("");
         int count=0;
// 		        String str2 = "";
//         int larg = Integer.MIN_VALUE;
//         int[] word = new int[256];
//         char f = ' ';
//         int q = 0;
//         for (int i = 0; i < str.length(); i++) {
//              word[str.charAt(i)]= word[str.charAt(i)] + 1;
//         }
//         for (int i = 0; i <= word.length - 1; i++) {
//             if (word[i]> 0){
//                 f = (char) i;
//                 q = word[i];
//                 String qq ="";
//                 if (q > 1){
//                     qq = String.valueOf(q);
//                 }
//                 str2+= String.valueOf(f)+qq;
//             }

//         }
//         return str2;
        
        
    for(int i=0;i<str.length();i++)
    {
        count=1;



        s2=s2+(str.charAt(i));

        while(i+1<str.length() && str.charAt(i+1)==str.charAt(i)  )
        {
            count++;

            i++;

        }
        if(count>1){
              s2=s2.concat(count+"");
 
        }

     
        }
        return s2;
       // System.out.print(s2);


        
        
        
        
              
        
        
        
	}

}
