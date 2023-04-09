import java.util.Scanner;
public class ReportFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		
		
		//while반복문을 사용하라고 했으므로
		while (true) {
			try {
				System.out.print("정수를 입력하세요>>");
				int a = sc.nextInt();
				if (a == -1) {
					break;
				} else {
					int result = a % day.length;
					System.out.println(day[result]);
				}
			} catch(Exception e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				// 토큰을 버린다.
				sc.next();
				
			}
		}
		System.out.print("프로그램을 종료합니다.");
		
	}

}
