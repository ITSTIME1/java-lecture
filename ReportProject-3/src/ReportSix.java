import java.util.Scanner;
public class ReportSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 정수를 10개 입력받는다.
		System.out.print("정수 10개 입력 >>");
	
		
		int[] num = new int[10];
		
		//입력된 배열들을 다 넣어주고
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		// 그 입력된 배열들을 가지고와서 하나씩 비교를 하면 될거 같은데
		// 입력된 배열들을 하나씩 탐색해서 현재 위치에 있는 값보다 작은 값이존재한다면
		// 서로 자리를 바꾸면 될거같은데
		int ori = 0;
		for(int i=0; i < num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if (num[i] < num[j]) {
					ori = num[i];
					num[i] = num[j];
					num[j] = ori;
				}
			}
		}
//		17 3 9 -6 77 234 5 23 -3 1
		for(int n : num) {
			System.out.print(n+" ");
		}

	}

}
