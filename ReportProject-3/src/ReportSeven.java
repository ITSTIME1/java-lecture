import java.util.Scanner;
public class ReportSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		// 어짜피 index가 매칭되어있으까
		
		
		String stand = "exit";
		while (true) {
			
			System.out.print("영어 단어를 입력하세요>>");
			// 영어단어를 입력받고
			String c = sc.next();
			if (c.equals(stand)) {
				break;
			}
				
			int index = 0;
			boolean isActive = true;
			for(int i = 0; i < eng.length; i++) {
				// 찾을 문자열이 eng[i]와 같을때 true를 리
				if (c.equals(eng[i])) {
					index = i;
					isActive = true;
					break;
				} else {
					isActive = false;
				}
			}
			if (isActive == true) {
				System.out.println(kor[index]);					
			} else {
				System.out.println("그런 영어 단어가 없습니다.");
			}
				
		}
		System.out.print("종료합니다...");
	}

}
