package whileLoops;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count= 0;
		int temp=n;
		while(temp>0) {
			temp/=10;
			count++;
				}
		System.out.println("no of digits are "+count);
	}

}
