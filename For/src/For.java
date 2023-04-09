
public class For {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int[] n = {1, 2, 3, 4, 5};
		// for - each 문
		for(int k : n) {
			sum += k;
		}
		
		
		// 일반적인 for문
		for(int i = 0; i < 10; i++) {
			sum += n[i];
		}
		
		// 배열
		// 빈 배열을 생성할때
		int ar[] = new int[10];
		int[] ar2 = new int[1000000];
		int[] ar1 = {1,2,3,4,5};
	
		
		
		double arr[] = new double[100000];
		
		
		
		System.out.println(sum);
	}
}

