import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.next();
		
		switch(grade) {
			case "A":
				System.out.print("Excellent");
				break;
			case "B":
				System.out.print("Excellent");
				break;
			case "C":
				System.out.print("Good");
				break;
			case "D":
				System.out.print("Good");
				break;
			default:
				System.out.print("Bye");
		}
		sc.close();
	}

}
