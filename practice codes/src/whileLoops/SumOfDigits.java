package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int temp=n;
	       int sum=0;
	       while(temp>0) {
	    	   int last=temp%10;
	    	   temp/=10;
	    	   sum+=last;
	       }
	 System.out.println("the sum is"+sum);
	       

	}

}
