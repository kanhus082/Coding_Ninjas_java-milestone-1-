public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        
        int str = 0;
        int end = arr.length - 1;

        while (str <= end){
           	
            int mid = str + (end - str) / 2;

            if (x == arr[mid])
                return mid;

            if (x < arr[mid]){
                end = mid - 1;
            }else if (x > arr[mid]){
                str = mid + 1;
            }
        }
        return -1;
    }

}
