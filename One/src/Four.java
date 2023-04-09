import java.util.Scanner;
public class Four {
	final static int x = 50;
	final static int y = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("점 (x, y)의 좌표를 입력하세요>>");
		int sx, sy;
		sx = sc.nextInt();
		sy = sc.nextInt();
		// 50보다 크거나 같고 y값보다 작거나 같고
		if ((sx >= x) && (sx <= y) && (sy >= x) && (sy <= y)) {
			System.out.print("사각형 내에 있습니다");
		} else {
			System.out.print("존재하지 않아요");
		}
		
	}

}
