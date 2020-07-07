package leetcode.ds.array;

public class EvenNumberOfDigits {

	public static void main(String[] args) {

		EvenNumberOfDigits evenNumberOfDigits = new EvenNumberOfDigits();
		int[] num= {1, 12,345,22,63,7896};
		evenNumberOfDigits.findNumbers(num);
	}
	
	public int findNumbers(int[] num) {
		int dig=0;
		int evenCnt=0;
		
		for(int i=0; i<num.length; i++) {
		int digCnt=digitCount(num[i]);//2
			if(checkEven(digCnt)) {
				evenCnt++; //1, 
			}
		}
		System.out.println(evenCnt);
		return evenCnt;
    }
	
	public int digitCount(int dig) {
		int cnt=0;
		while(dig!=0) {
			dig= dig/10;
			cnt++;
		}
		return cnt;
	}
	public boolean checkEven(int dig) {
		if(dig%2 ==0) return true;
		else return false;
	}

}
