import java.util.Scanner;
public class ReportFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// 사용자가 정수를 입력하지 않았다면 프로그램 종료
		System.out.print("정수를 입력하세요>>");
		try {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				System.out.print("짝수");
			} else {
				System.out.print("홀수");
			}
			
		}catch(Exception e) {
			System.out.print("수를 입력하지 않아 프로그램 종료합니다.");
		}

	}

}
