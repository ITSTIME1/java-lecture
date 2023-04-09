import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a =sc.nextInt();
		int b = sc.nextInt();
		// 우선 int를 toSTring으로 변환해서 출력해야 되는게 필요 했기 때문에
		// integer.toString을사용 추가적으로 은 이라는 글자는 처음에 char로 사용하려 했지만 띄어 쓰기가 존재하기 떄문에
		// 문자를 표현하는 char 말고 인용부호 ""를 사용해 문자열로 표현
		System.out.print(Integer.toString(a)+"+"+Integer.toString(b) + "은 " + (a+b));
		
	}

}
