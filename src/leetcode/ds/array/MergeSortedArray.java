package leetcode.ds.array;

public class MergeSortedArray {

	public static void main(String[] args) {
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		int[] nums1= {4,5,6,0,0,0};
		int[] nums2= {1,2,3};
		int m=3;
		int n=3;
		mergeSortedArray.merge(nums1, m, nums2, n);

	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
      int nums1_len= nums1.length;
      int nums2_len= nums2.length;
      print(nums1);
      print(nums2);
      for(int i=0; i<n; i++) {
    	  nums1[m]=nums2[i];
    	  m++;
      }
      print(nums1);
      print(nums2);
      sort(nums1);
      print(nums1);
    }
	
	public void sort(int nums1[]) {
		int temp=0;
		for(int j=0; j<nums1.length;j++) {
			for(int i=j+1;i<nums1.length;i++) {
				if(nums1[j]>nums1[i]) {
					temp=nums1[j];
					nums1[j]=nums1[i];
					nums1[i]=temp;
				}
			}
		}
	}
	
	public void print(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
