import java.util.Arrays;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int l=0,r=arr.length-1,count=0;
        while(l<=r)
        {
           int sum=arr[l]+arr[r];
			if(sum==num)
            {

            	int i=l,j=r;
                int c1=0,c2=0;
                while(i<arr.length)
                {
                    if(arr[i]==arr[l])
                        c1++;
                    else
                        break;
                    i++;
                }
                while(j>=0)
                {
                    if(arr[j]==arr[r])
                        c2++;
                    else
                        break;
                    j--;
                }
                if(arr[l]==arr[r])
                {
                    count+= (c1)*(c1-1)/2;
                }
                else
                    count+= c1*c2;
                l=i;
                r=j;
               
            }
        	else if(sum<num)
            {
				l++;
            
            
            }
            if(sum>num)
            {
				r--;
            
            
            
            }
        
        
        
        
        
        
        }
        
     /*    int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==num){
                    ans++;
                }
            }
        }
        return ans;
        */
        return count;
	}
}
