public class Solution{  
    
    /*  
        The given approach is not the best possible solution. 
        A better way will be taught later in the course once we
        cover the Time/Space Complexity in the Data Structures and 
        Algorithms part
    */
    
    public static void intersections(int arr1[], int arr2[]) {
    
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}