package ds.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxConsecutiveOnes maxConsecutiveOnes= new MaxConsecutiveOnes();
		int[] num= {1,0,1,1,1,1,1,1,0,1,0,1,1,1,1,0,0,1,1};
		maxConsecutiveOnes.findMaxConsecutiveOnes(num);
	}

	public int findMaxConsecutiveOnes(int[] num) {
        int cnt=0;
        int temp[]= new int[num.length];
        int k=0;
        System.out.println("len: "+num.length);
        	System.out.println("temp: "+temp); 
        	for(int j=0;j<num.length;j++) {
        		System.out.println("j: "+j); 
            	 if(num[j]==1) {
                 	temp[k]=num[j];
                 	k++;
                 	if(cnt<k) {
           			 cnt=  k;
                 	}
                 }
            	 else { 
            		 
            		 emptyTheArray(temp);
            		k=0;
            	 }
            }
        System.out.println("number of consecutive ones: "+cnt);
		return cnt;
    }
	
	public void emptyTheArray(int[] temp) {
		 for(int i=0; i<temp.length; i++){
			 temp[i]=0;
		 }
		
	}
}
