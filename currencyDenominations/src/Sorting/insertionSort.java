package Sorting;

public class insertionSort {
	public static void insertionsort(int A[]) {
		int n=A.length;
		for (int i=1;i<n;i++) {
			int key = A[i];
			int j=i;
			while((j>=1)&&(A[j-1]<key)) {
			A[j]=A[j-1];
			j--;
		}
			A[j]=key;
		}
	}
	

}
