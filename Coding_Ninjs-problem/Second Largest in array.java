public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
         int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }else if(arr[i]>sl&&arr[i]!=l)
                sl=arr[i];
        }
    return sl;
    }

}