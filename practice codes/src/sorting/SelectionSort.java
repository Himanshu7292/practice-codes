package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		n=a.length;
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i <=n-1; i++) {
			int minInd=i;
			for (int j = i; j <=n-1; j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
     System.out.println(Arrays.toString(a));
	}

}
