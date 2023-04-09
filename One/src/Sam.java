import java.util.Scanner;
public class Sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 99; i++) {
			int n = sc.nextInt();
			// 몫과 나머지가 있네
			int count = 0;
			if (n/10 == 3) {
				count++;
			}
			if (n%10 == 3 || n %10 == 6 || n%10 == 9) {
				count++;
			}
			
			if (count == 0) {
				System.out.print("박수없음");
			} else if (count == 1){
				System.out.print("박수짝");
			} else if (count == 2) {
				System.out.print("박수짝짝");
			}
			
			
		}
	}

}
