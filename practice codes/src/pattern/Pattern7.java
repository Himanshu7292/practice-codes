package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int num=1;
		for (int i =1 ; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print(num+"   ");
				num++;
			}
			System.out.println();
		}
	}

}
