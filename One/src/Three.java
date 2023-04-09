import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x 값을 입력하세요>>");
		int a = sc.nextInt();
		// 강제 캐스팅 진행
		// 큰 값에서 작은 값으로
		int result = (int)Math.pow(a, 2)-3*a+7;
		System.out.print("x=" + Integer.toString(a) +","+ "y=" + result);
	}

}
