class Circle {
	private int radius;
	
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
} 

/*
 * 오직 static 메소드만 가진다고함.
 * static 을 가진 클래스 내부에서는 static 메소드는 static 멤버, 메소드만 접근가능.
 * non-static 메소드는 static 메소드와 멤버 접근가능.
 * 이 클래스는 Circle 클래스와 별개인 클래스기 때문에 CircleManager가 static 메소드를 지니고 있는것.
 * 따라서 객체를 파라미터로 넘겨받고 그 값을 이용해 getRadius()를 불러올 수 있는 이유는 Circle이 default 클래스기 떄문.
 * 현재 동일 패키지 상에 놓여있기 때문에 접근이가능.
 */

class CircleManager {

	static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	
	
	static boolean equals(Circle a, Circle b) {
		if (a.getRadius() == b.getRadius()) {
			return true;
		} else {
			return false;
		}
	}
	
}


public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		/* 
		 * 3항 연산자를 활용하여 크기를 비교 만약 pizza의 둘의 크기가 같은경우 true
		 * 둘의 크기가 다른 경우라면 false
		 * */
		boolean res = pizza.getRadius() == waffle.getRadius() ? true : false;
		
		
		// 크기가 동일하지 않은 경우라 false
		if(res == true) {
			System.out.println("pizza와 waffle 크기 같음");
		} else {
			System.out.println("pizza와 waffle 크기 다름");
			
			
		}
		
		// 객체가 인수로 넘겨질 경우 실인자 값을 공유
		CircleManager.copy(pizza, waffle);
		res = CircleManager.equals(pizza, waffle);
		
		if(res == true) {
			System.out.println("pizza와 waffle 크기 같음");
		} else {
			System.out.println("pizza와 waffle 크기 다름");
		} 

	}

}
