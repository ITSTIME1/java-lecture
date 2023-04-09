import java.util.Scanner;

class Rect {
	private int width, height;
	
	// 생성자
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
}



public class ReportProjectThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rect arr[] = new Rect[4];
		
		// 입력받아 객체배열의 각각을 저장해준다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + " 너비와 높이 >>");
			Rect r = new Rect(sc.nextInt(), sc.nextInt());
			arr[i] = r;
		}
		
		System.out.println("저장하였습니다...");
		
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i].getArea();
		}
		
		System.out.print("사각형의 전체 합은 " + total);
		
		
		

	}

}
