import java.util.Scanner;
public class Report {

	public static void main(String args[]) {
		
		// Scanner 클래스의 인스턴스를 생성하여 입력을 받음.
		// 스캐너 객체의 변수명은 이제부터 sc로 임의로 정함.
		// 알파벳을 입력하라는 문자열이 출력되니 똑같이 문자열을 출력해서 값을 입력받을 준비.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 하나 입력하세요: ");
		
		// next() 메소드를 활용하여 문자를 입력받음.
		String input = sc.next();
		
		
		// 책의 힌트에 나와있던 것 처럼 charAt()을 활용하는것 같음.
		// charAt = Returns the char value at the specified index.
		// 즉 charAt()괄호안에 들어갈 값은 매개변수로 int index를 함수내부에서 정의되어져 있음.
		// 때문에 어짜피 하나의 문자만 받을 것이므로 0번 인덱스를 넣어서 하나의 문자만 가지고 오게 구현.
		// 어떻게 출력할지 생각하다가 아스키 문자로 받으면 편할거 같아 아스키 문자로 계산.
		// 아스키 문자는 'a' = 65 부터 시작이 되어 z(122)까지 존재.
		// 때문에 정수형이라 생각하고 나중에 그 값을 캐스팅 한다고 생각하면 될거 같음.
		// 그래서 예제를 보니 abcde bcde 순으로 문자가 하나씩 증가하여 그 길이가 짧아지고 있는게 확인 되고
		// 결국 항상 내부 반복문의 시작이 0이 아니라는것.
		// 0이 아닌 0~l까지 즉 입력받은 문자의 범위까지 출력하는게 목적이기 때문에
		// 처음엔 0으로 시작하되 외부 반복문의 끝은 e도 출력하고 있기 때문에
		// 'e'-'a'+1 만약 1를 하지 않으면 e를 출력할 수 없기 때문에 +1 을 하여 index를 임의적으로 하나 올려줌
		// 이후 j의 시작은 = i와 같게 하여 i가 하나올라갈때마다 내부 반복하는 값 또한 같이 올라갈 수 있도록 구현.
		// 그 뒤 65+n만큼의 숫자가 곧 문자이기 때문에 아스키 코드의 a문자부터 시작하여 값을 더해줌
		// 처음엔 j=0이므로 65+0 = 65 = 'a'
		// 두번째 j=1이므로 65+1 = 66 = 'b'
		// 이런식으로 e까지 전부 돌아줌으로써 구한 문자만 기존의 문자와 합쳐주기만하면됨
		// 때문에 String 문자열 변수를 하나 생성해둔뒤 초기화값으로 아무것도 없는 값 빈 문자열을 넣어줌.
		// 그 뒤 강제 캐스팅한 char문자로 캐스팅한 값을 result에 하나 더해 j가 올라가더라도 기존의 더해졌던 문자는 사라지지 않아.
		// 그 문자뒤에+연산이 되어합쳐지게 됨.
		// 그렇께 e까지 전부 순회하였다면
		// 내부 for문을 벗어난것이므로 현재까지 입력되었던 문자 result를 출력해본다면 얻을 수 있음
		char l = input.charAt(0);
		for (int i = 0; i < l-'a'+1; i ++) {
			String result = "";
			for (int j = i; j < l-'a'+1; j++) {
				result += (char)('a'+j);
			}
			System.out.print(result + "\n");
		}
	}	
	
}
