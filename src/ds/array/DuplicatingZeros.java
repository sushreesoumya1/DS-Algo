package ds.array;

public class DuplicatingZeros {

	public static void main(String[] args) {

		DuplicatingZeros duplicatingZeros= new DuplicatingZeros();
		int[] array= {1,0,2,3,0,4,0};
		duplicatingZeros.duplicateZeros(array);
		
	}
	public void duplicateZeros(int[] givenArray) {
		print(givenArray);
		
		int len=0;
		int givenArrayLen=givenArray.length;
		int[] tempArray= new int[givenArrayLen];
			
		for(int i=0; i<givenArrayLen; i++) {
			if(len<givenArrayLen) {
				if(givenArray[i]==0) {
					tempArray[len]=givenArray[i];
					len++;
					tempArray[len]=givenArray[i];
					len++;
				}else {
					tempArray[len]=givenArray[i];
					len++;
				}
			}
			}
		for(int j=0; j< givenArray.length; j++){
	           givenArray[j]=tempArray[j];
	       }
		print(givenArray);
		
        
    }
	
	public void print(int[] givenArray) {
		for(int i=0; i<givenArray.length; i++) {
			System.out.print(givenArray[i]);
		}
		System.out.println();
	}
	
}
