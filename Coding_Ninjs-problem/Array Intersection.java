public class Solution {

    public static void merge(int[] s1, int[] s2, int[] s3) {
             int i = 0;
             int j = 0;
             int k = 0;
          while (i<s1.length && j<s2.length) {
              if(s1[i]<=s2[j]){
                   s3[k]=s1[i];
                  i++;
                  k++;}
              else {
                  s3[k]=s2[j];
                  j++;
                  k++;
              }
          }
              if (i < s1.length) {
                  while (i < s1.length) {
                      s3[k] = s1[i];
                      i++;
                      k++;
                  }
              }
              if (j < s2.length) {
                  while (j < s2.length) {
                      s3[k] = s2[j];
                      j++;
                      k++;
                  }
              }
        }
  
      public static void mergeSort(int[] input) {
          // Write your code here
          int l = input.length;
          if (l <= 1) {
              return;
          }
          int[] smalla1 = new int[l / 2];
          for (int i = 0; i < l / 2; i++) {
              smalla1[i] = input[i];
          }
          int[] smalla2 = new int[l - smalla1.length];
          for (int i = l / 2; i < l; i++) {
              smalla2[i - l / 2] = input[i];
          }
          mergeSort(smalla1);
          mergeSort(smalla2);
          merge(smalla1, smalla2, input);
      }
  
  
      public static void intersection(int[] arr1, int[] arr2) {
       mergeSort(arr2);
      mergeSort(arr1);
          int i= 0;
          int j=0;
          while(i<arr1.length && j<arr2.length){
              if(arr1[i]<arr2[j]){
                  i++;
              }
              else if(arr1[i]>arr2[j]){
                  j++;
              }
              else{
                  System.out.print(arr1[i]+" ");
                  i= i+1;
                  j= j+1;}
              
          }
       
      }
      
  }
