package leetcode.ds.array;

public class HeightCheck {

	public static void main(String[] args) {

		int[] arr= {1,1,4,2,8,1,3};
		HeightCheck h=new HeightCheck();
		h.heightChecker(arr);
	}
	
	public int heightChecker(int[] heights) {
		int num;
		int cnt=0;
		int[] oldHeights= new int[heights.length];
		for(int i=0;i<heights.length;i++) {
			oldHeights[i]=heights[i];
		}
		print(heights);
		print(oldHeights);
		for(int i=0;i<heights.length;i++) {
			for(int j=i+1; j<heights.length;j++) {
				if(heights[i]>heights[j]) {
					num=heights[i];
					heights[i]=heights[j];
					heights[j]= num;
				}
			}
			 if(oldHeights[i]!=heights[i]) {
					cnt++;
				}
		}
		print(heights);
		print(oldHeights);
		
		/*for(int i=0;i<heights.length;i++) {
			if(oldHeights[i]!=heights[i]) {
				cnt++;
			}
		}*/
		System.out.println("cnt: "+cnt);
		return cnt;
        
    }
	
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

/*81 / 81 test cases passed.
Status: Accepted
Runtime: 12 ms
Memory Usage: 39.3 MB*/


/*WITHOUT SYSO:
	81 / 81 test cases passed.
	Status: Accepted
	Runtime: 4 ms
	Memory Usage: 38.7 MB*/

/*WITHOUT num
	81 / 81 test cases passed.
	Status: Accepted
	Runtime: 5 ms
	Memory Usage: 39.5 MB*/