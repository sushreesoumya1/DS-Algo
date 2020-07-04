package ds.array;

public class CheckIfNumExist {

	public static void main(String[] args) {

		CheckIfNumExist checkIfNumExist= new CheckIfNumExist();
		int[] arr= {0,0};
		checkIfNumExist.checkIfExist(arr);
		
	}
public boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == (arr[j]*2)){
                    System.out.println("if");
                    return true;
                }else{
                    System.out.println("else");
                   // return false;
                    
                }
            }
        }
        System.out.println("def");
        return false;
        }

}
