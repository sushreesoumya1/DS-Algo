package ds.array;

public class SortedSquaresInPlace {

	public static void main(String[] args) {
		SortedSquaresInPlace s= new SortedSquaresInPlace();
		int[] givenArray= {4,5,7,6,3,0,9,14,11};
		s.sort(givenArray);
		//s.sort1();
	}
	
	 public int[] sort(int[] givenArray) {
		 print(givenArray);
		 for(int i=0;i<givenArray.length-1;i++) {
			 for(int j=i+1;j<givenArray.length;j++) {
				 if(givenArray[i]>givenArray[j]) {
					 givenArray[i]=givenArray[i]+givenArray[j];
					 givenArray[j]=givenArray[i]-givenArray[j];
					 givenArray[i]=givenArray[i]-givenArray[j];
				 }
			 }
		 }
		 print(givenArray);
		return givenArray;
		 
	 }
	 
	 public void print(int[] givenArray) {
		 for(int i=0;i<givenArray.length;i++) {
			 System.out.print(givenArray[i]+" ");
		 }
		 System.out.println();
	 }
	 
	 public void sort1() {
		 int a=19;
		 int b=30;
		 System.out.println(a+ " "+b);
		 a=a+b;//17
		 b=a-b;//10
		 a=a-b;//7
		 
		 System.out.println(a+ " "+b); 
	 }

}

/*132 / 132 test cases passed.
Status: Accepted
Runtime: 1400 ms
Memory Usage: 41.1 MB*/
