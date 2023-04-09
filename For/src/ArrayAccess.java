import java.util.Scanner;



public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 5개 최대
		
		int ar[];
		ar = new int[5];
		
		
		
//		int max = 0;
//		for (int i = 0; i < 5; i++) {
//			int h = scanner.nextInt();
//			ar[i] = h;
//			if (ar[i] > max) {
//				max = ar[i];
//			}
//		}
		
//		for (int i = 0; i < 5; i++) {
//			if (ar[i] > max) {
//				max = ar[i];
//			}
//		}
		
		int index = 0;
		while(index != 5) {
			int h = scanner.nextInt();
			ar[index] = h;
			index += 1;
			
		}
			
		for (int k : ar) {
			// pirnt() 자체는 줄바꿈이 안되네
			// println() 자체는 줄바꿈이 자동으로되네
			System.out.println(k);
		}
		

	}

}
