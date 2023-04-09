import java.util.Scanner;
public class ReportThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 하...
		//2. 정수를 10개 입력받아 배열에 저장한 후, e배열을 검색하여 3의 배수만 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.print("출력결과>>");
		
		int[] a = new int[10];
		
		// 입력받은 정수 저장.	
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		
		
		// 3의 배수만 출력
//		for(int i=0; i < a.length; i++) {
//			if (a[i] % 3 == 0) {
//				System.out.println(a[i]);
//			d}
//		}
		
		for(int c : a) {
			if (c % 3 == 0) {
				System.out.print(c+" ");
			}
		}
		
	}

}
