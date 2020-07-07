package leetcode.ds.array;

public class SortedSquares {

	public static void main(String[] args) {

		int[] array= {-7,-3,2,3,11};
		SortedSquares sortedSquares = new SortedSquares();
		sortedSquares.sort(array);
	}
	public int[] sort(int[] givenArray) {
		int len=givenArray.length;
		int[] temp= new int[len];
		int[] sortedArray = new int[len];
		
		for(int i=0; i<len; i++) {
			temp[i]= givenArray[i]*givenArray[i];
		}
		
		print(temp);
		sortArray(temp);
		
		return sortedArray;
		
	}
	
	public void print(int[] givenArray) {
		for(int i=0; i<givenArray.length; i++) {
			System.out.println(givenArray[i]);
		}
	}
	
	public int[] sortArray(int[] temp) {
		int num;
		for(int i=0; i<temp.length; i++) {
			for(int j=i; j<temp.length; j++) {
				if(temp[i]>temp[j]) {
					num=temp[i];
					temp[i]=temp[j];
					temp[j]=num;
				}
			}
		}
		System.out.println("---------");
		print(temp);
		return temp;
	}

}

/*132 / 132 test cases passed.
Status: Accepted
Runtime: 1069 ms
Memory Usage: 52.3 MB*/
