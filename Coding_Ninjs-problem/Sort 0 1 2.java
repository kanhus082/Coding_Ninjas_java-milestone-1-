public class Solution {

    public static void sort012(int[] arr){
        
         int swap = 0;
       int l = arr.length-1;
       int i =0;
       
       while (i <= l){
           
           if (arr[i] == 0){
              
               int temp = arr[swap];
               arr[swap] = arr[i];
               arr[i] = temp;
               i++;
               swap++;
               
           }else if(arr[i]==2){
               
               int temp=arr[l];
               arr[l] = arr[i];
               arr[i] = temp;
               l--;
               
           }else{
               i++;
           }
       }
   
    }
}
