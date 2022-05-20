public class Solution {

	public static void leaders(int[] input) {
		
	int size = input.length;
        int max_from_right =  input[size-1];
   
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");
       
        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right <= input[i])
            {           
            max_from_right = input[i];
            System.out.print(max_from_right + " ");
            }
        }	
	}
	
}
