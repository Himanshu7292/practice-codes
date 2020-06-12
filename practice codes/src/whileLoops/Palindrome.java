package whileLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			temp/=10;
			rev=rev*10+rem;
		}
		if(rev==n) {
			System.out.println( n+"palindrome");
		}
		else {
			System.out.println(n+"not a palindrome");
		}
		
	}

}
