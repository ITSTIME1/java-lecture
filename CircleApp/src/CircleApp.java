import java.util.Scanner;
class Circle {
	// private로 인해 직접 접근이 안되기 때문에
	// 간접적으로 setRadius를 통해서 rdiuis의 값을 수정할 수 있다.
	private double radius;

	// default constructor
	public Circle() {
		this.radius = 1;
	}
	
	// 
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * (radius * radius);
	}
	
	
	// sette 역할
	public void setRadius(double radius) {
		this.radius = radius;
	}
}



public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		Circle cir = new Circle(src.nextDouble());
		Circle cir2 = new Circle();
		// private 이기 때문이지
		// 그래서 get 메소드등을 통해서 혹은 setter메소들르 통해서
		// radius를바꿔 줄 수 있지
//		System.out.print(cir2.radius);
		cir2.setRadius(src.nextDouble());
		
		System.out.print(cir.getArea());

	}

}




class Sample { 
	public int a; 
	private int b;
	
	// default
	int c;
	// imm
	public void setter(int input) {
		this.b = input;
	}
	public int getter() {
		return this.b;
	}
}
