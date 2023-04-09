// 클래스 밖의 선언할 수 있는 유일한 것 import
import java.util.Scanner;

 
public class FindPI {
	// static으로 메모리를 한번만 할당.
	final static double PI = 3.141592;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("원의 반지름 : ");
		Scanner s = new Scanner(System.in);
		final double radius = s.nextDouble();
		double area = PI*radius*radius;
		System.out.println("원의 면적은 : " + area + " 입니다.");

		
	}
}

