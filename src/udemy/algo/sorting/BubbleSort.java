package udemy.algo.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {-9,-87,3,54,2,5};
		print(arr);
		for(int i=arr.length;i>=0; i--) {
			for(int j=0; j<i-1;j++) {
				if(arr[j]>arr[j+1])
				swap(arr,j,j+1);
			}
		}
		print(arr);
	}
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
