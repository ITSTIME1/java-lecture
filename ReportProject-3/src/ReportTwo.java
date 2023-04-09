import java.util.Scanner;

/*
 * 1. 스캐너 객체를 sc로 생성한 뒤 문자를 입력하라는 메세지를 출력.
 * 2. next() 메소드를 활용해 문자열을 입력받는다.
 * 3. 그 후 책에 나와있던 charAt()메소드의 힌트를 얻어 문자열에서 하나의 문자만 가져오기 위해 index = 0번째 문자를 가져온다.
 * 0번째 문자를 가져오는 이유는 입력받은 문자열에서 단어 하나만 입력되었기 때문에 그 문자의 첫번째 요소만 가지고 오면 되기 때문이다.
 * 4. 알파벳 a-z까지 해당하는 소문자 문자 1차원 배열을 생성.
 * 5. al 알파벳 배열을 al.length 까지 탐색하면서 사용자가 입력했던 문자와 동일한 위치의 index를 반환.
 * 6. 그렇지 않은 것들은 전부 continue 만약 해당 알파벳을 발견했다면 break
 * 7. 이후 해당 인덱스 까지 출력해야 하므로 해당 인덱스까지를 외부 반복문의 조건으로 배치
 * 8. 내부적으로 a..b..c..d.. 순서대로 인덱스가 증가함을 알 수 있기 때문에 i가 증가하면 따라서 증가할 수 있도록 j=i 로 구현.
 * 9. 그 후 빈문자열을 하나 만들어두고 빈문자열에 문자를 하나씩 더하면서 내부반복문이 끝났다면 해당 문자열을 출력.
 */

public class ReportTwo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String input = sc.next();
		
		
		char c = input.charAt(0);

		char[] al = {'a', 'b', 'c', 'd', 'e',
				'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z'};

		int index = 0;
		for (int i = 0; i < al.length; i++) {
			if (al[i] == c) {
				index = i;
				break;
			} else {
				continue;
			}
		}
		
		for (int i = 0; i <= index; i++) {
			String result = "";
			for (int j = i; j <= index; j++) {
				result += al[j];
			}
			System.out.println(result);
		}
		
	}
}
