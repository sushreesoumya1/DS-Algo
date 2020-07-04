package ds.array;

public class MountainArray {

	public static void main(String[] args) {

		MountainArray mountainArray = new MountainArray();
		int[] A= {0,1,2,3,4,5,6,7,8,9};
		mountainArray.validMountainArray(A);
	}
	public boolean validMountainArray(int[] A) {
		int i_flag=0;
		int d_flag=0;
		int cnt=0;
		if(A.length>=3) {
			for(int i=0;i<A.length-1; i++) {
				if(A[i]<A[i+1] && d_flag==0) {
					i_flag=1;
					//d_flag=0;
					cnt++;
				}else if(i_flag!=0 && A[i]>A[i+1]) {
					d_flag=1;
					//i_flag=0;
					cnt++;
				}else {
					System.out.println(false);
					return false;
				}
			}
		}
		if(A.length>=3 && cnt==A.length-1 && d_flag!=0){
			System.out.println(true);
			return true;
		}else {
			System.out.println(false);
		}
		return false;
    }

}
