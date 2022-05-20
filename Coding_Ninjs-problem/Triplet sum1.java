import java.util.*;
public class Solution {

    public static int tripletSum(int arr[], int k){
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int temp = k- arr[i];
            // finding pairs of temp;
            count += findPairHelper(arr, i+1, n-1, temp);
        }

        return count;
    }

    private static int findPairHelper(int arr[], int sI, int eI, int key){
        int numPair = 0;
        while(sI < eI){
            if(arr[sI] + arr[eI] > key)/*Since array is sorted so while adding the element at ith index and jth index 
             and if you get sum greater than  k then you need to decrement j because j is at end index*/
                eI--;
            else if(arr[sI] + arr[eI] < key)/*while adding the element at ith index at the jth index if you get sum
             less than key then you need to increment the i because i is at starting index*/
                sI++;
            else if(arr[sI] == arr[eI]){
                // if both elements are same;
                /*if the elment at the ith index is equal to element at the jth index then all the elements
                 in the middle are also equal for example : 4, 4, 4, 4, now element at startIndex is 4 and element at endIndex is
                 if you see carefully all the elements in middle also equal and this is because our array is sorted in ascending
                 order so whenever we get such input we need total combination of pair that are possible out of n equal elements
                 that is Nc2 so we use here Ncr formula to find totoal combination of pair out of n equal elements*/
                int num = (eI - sI) + 1;
                numPair += ncr(num,2);
                return numPair;
            }
            else {
                /* This code wiill work for all other condtions such as if current element is equal to previous
                element for exmaple {5,10,15,15,20} and this else condtion will work only as you 
                know whent element at start index +element at end Index =k where the k is the number
                for whihc we need to find a pair */
                

                int startElement = arr[sI];
                int endElement = arr[eI];
                int tempStartIndex = sI + 1;
                int tempEndIndex = eI - 1;

                while(tempStartIndex <= tempEndIndex && arr[tempStartIndex] == startElement)
                    tempStartIndex++;

                while(tempStartIndex <= tempEndIndex && arr[tempEndIndex] == endElement)
                    tempEndIndex--;

                int totalElementFromStart = tempStartIndex - sI;
                int totalElementFromEnd = eI - tempEndIndex;

                numPair += (totalElementFromEnd * totalElementFromStart);

                sI = tempStartIndex;
                eI = tempEndIndex;
            }
        }

        return numPair;
    }
    public static int ncr(int num,int r)
    {

        int ans=(factorial(num)/factorial(num-r))/factorial(r);
        return ans;

    }
    public static int factorial(int number)
    {
        int ans=1;
        for(int i=1;i<=number;i++)

            ans*=i;
        return ans;
    }
}