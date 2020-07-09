package udemy.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {-5,7,5,6,-3,9,32,5,1};
		print(arr);
		int maxIndex=0;
		for(int i=arr.length-1; i>=0;i--) {
			maxIndex=0;
			for(int j=0;j<=i;j++) {
				if(arr[maxIndex]<arr[j]) {
					maxIndex=j;
				}
			}
			swap(arr,i,maxIndex);
		}
		print(arr);
	}
	public static void swap(int[]arr,int i,int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void print(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
