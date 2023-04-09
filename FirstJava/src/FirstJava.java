
public class FirstJava{
//	int i;
//	int j;
//	i = 20;
//	j = 30;
//	System.out.println(i+j);
	
	public static int sum(int a, int b) {
//		return a+b;
//	}
//
//	public static void main(String[] args) {
//		
////		MyClass myClass = new MyClass();
////		myClass.a = "hhddd";
////		myClass.b = "taesun";
////		System.out.println(myClass.a);
////		System.out.println(myClass.b);
////	
////		// static 메소드로 되어 있는 메소드에서 클래스 내에 다른 메소드를 참조하려면
////		// 그 메소드 또한 static으로 설정되어 있어야 한다.
////		int c = sum(10, 20);
////		System.out.print(c);
	int a = 1;
	int b;
	System.out.println(a);
	// 전위 증가와 후위 증가의 차이점은 반환하는 값의 대한 차이가 있다.
	// 먼저 전위 증가 연산자는 ++a를 1증가 시킨뒤 b에 대입하여 a, b 둘다 2를 가지고 있다.
	// 반면에 후의 증가 연산자는 a를1증가시키지만 그 증가시킨 2를 반환하는게 아니라 증가시키기전의 값을 b의 반환한다
	// 따라서 b는 증가전의 값인 1이 들어가게되고 a는 증가했기 때문에 a에는 2가 들어가게 되는것이다.
//	b = ++a;
	b = a++;
	System.out.println(b);
	System.out.println(a);
//	}
	
	
}