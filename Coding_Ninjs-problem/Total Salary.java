import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      int basic = sc.nextInt();
      char grade = sc.next().charAt(0);
      int allow = 1300;
      if(grade == 'A') {
    	  allow = 1700;
      }else if(grade == 'B') {
    	  allow = 1500;
      }
        
      double hra = 0.2*basic;
      double da = 0.5*basic;
      double pf = 0.11*basic;
      double total =  basic + hra + da - pf + allow;
      System.out.println(Math.round(total));

	}
}