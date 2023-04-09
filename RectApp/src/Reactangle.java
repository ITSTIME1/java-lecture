
// 모델링
// 접근지정자가 없음 = default 가 존재 그럼 같은 패키지 내에서는 접근이 가능.
// 하나의 소스파일에는 public 클래스가 하나만 있을 수 있음.
// java 소스파일과 같은 클래스 이름이 대표 클래스가 될 수 있다는걸 알 수 있음.
public class Reactangle {
	int width;
	int height;
	
	int getAreat() {
		return width * height;
	}
	
	int getApple() {
		return width;
	}
}

// 하나도 없어도 상관이 없다 public이
// 두개의 클래스중 그럼 대표가 되는클래스 이름은 소스파일의 이름이어야 한다는것.
// 즉 Rectagnel을 대표클래스로 만든다면 오류가되는거
class ReacApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reactangle a = new Reactangle();
		a.width = 10;
		a.height = 10;
		
		

	}

}
