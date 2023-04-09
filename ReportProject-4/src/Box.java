
public class Box {
	private int width, height;
	private char fillChar;
	
	/*
	 * this() 메소드를 사용하여 10, 1을 고정적인 값으로 넘겨주었다.
	 * 만약 문제를 이해한게 이게 맞다면 기본 생성자를 활용한 예시는 고정적인 값을 파라미터로 넘기는 것 같다.
	 * 때문에 this() 메소드는 클래스내에서 다른 생성자를 호출하는 기능이기 때문에 두 인수를 받는 생성자는 딱 한개 존재하며 그 생성자를 호출하게 된다.
	 * 그렇게 되면 width, height 각각의 값에 저장된다.
	 * */
	public Box() {
		this(10, 1);
	}
	
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	/*
	 * draw 메소드의 따로 배열이나 문자열을 리턴하는건 없어 보이기 때문에 두가지 방법으로 따로 구현해보았다.
	 * 첫번째 방법은 문제에서 제시된 함수의 구성내용만을 가지고 구현한 결과 fillChar의 저장되어 있는 문자열 값들만 가지고 출력을 이어 나갈 수 있게끔 print()함수를 사용했다.
	 * 그리고 한 줄이 끝나게 되면(한줄의 출력이 끝났다면) 다음줄로 넘어가기 위해서 println() 함수를 이용했다.
	 * 
	 * 
	 * 두번째 방법은 String 변수 하나를 선언한뒤 fillChar에 바로 접근이 가능하지만 getter()를 한번 만들어서 접근을 시켜보았다.
	 * 그리고 한 줄의 출력이 모두 끝났으면 arr += "\n" 줄 바꿈 문자를 마지막에 넣어서 다음줄로 넘겼다.
	 * 
	 * 둘의 출력결과는 동일하다. 하지만 문제에서 원하는 형태의 답은 첫번째 내용이 더 가깝다.
	 * */
	public void draw() {
//		String arr = "";
		
		for(int i =0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(fillChar);
//				arr += getter();
			}
			System.out.println();
//			arr += "\n";
		}
		
//		System.out.print(arr);
	}

	
//	public char getter() {
//		return this.fillChar;
//	}
//	
	
	public void fill(char c) {
		this.fillChar = c;
	}
	
	public static void main(String[] args) {
		/* 
		 * 문제를 이해한게 맞다면 기본 생성자를 이용해서 즉 default 생성자를 사용해서 만드는 그림은 10*1로 고정되어 있다.
		 * 인수 두개를 받는 객체는 값에 따라 변경되게끔 구현해야된다.
		 * */
		Box a = new Box();
		Box b = new Box(20, 3);
		
		a.fill('*');
		b.fill('%');
		
		a.draw();
		b.draw();

	}

}
