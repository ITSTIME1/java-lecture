import java.util.Scanner;
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("논리 연산을 입력하세요");
		boolean b = sc.nextBoolean();
		String o = sc.next();
		boolean s = sc.nextBoolean();
		
		switch(o) {
			case "OR":
				// or연산
				System.out.print(b||s);
				break;
			case "AND": 
				System.out.print(b && s);
				break;
		}
	}

}
