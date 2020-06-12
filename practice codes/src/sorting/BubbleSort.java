package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {8,5,4,9,1};
		int n=a.length;
		for (int i = 0; i <=n-1; i++) {
			boolean sorted=true;
			for (int j = 0; j < n-1; j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted =false;
				}
			}
			if(sorted) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(a));
//		for(int item:a) {
//			System.out.println(item+" ");
//		}
	}

}
