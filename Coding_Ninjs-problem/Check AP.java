import java.util.Scanner;
public class Main {
	
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<n-2;i++){
            if((arr[i+1]-arr[i]) != (arr[i+2]-arr[i+1])){
                flag=false;
                break;
            }
        }
        System.out.print(flag);
}
}