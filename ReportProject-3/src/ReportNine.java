import java.util.Scanner;
public class ReportNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] ar = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
	
		
		// 가위 0
		// 바위 1
		// 보  2
		
//		0 < 1 짐
//		1 < 2 짐
//		0 < 2 짐
		while(true) {
			System.out.print("가위 바위 보!>>");
			String ch = sc.next();
			if (ch.equals("그만")) {
				break;
			} else {
				int computer = (int)(Math.random()*3);
				// computer 는 0, 1, 2 세개중에 하나를 생성할거고
				// 항상 작은 수를 낸 사람이 지는거 그럼 큰 수를 낸 사람을 출력
				// 만약 서로 같은걸 냈다면 비겼습니다 출력
				int index = 0;
				for (int i =0; i < ar.length; i++) {
					if (ar[i].equals(ch)) { 
						
						index = i;
						break;
					}
				}
				// switch 문으로 나눠야 되나
				// 사용자가 가위를 냈을때 이길 수 있는건 보자기 밖에 없고
				// 사용자가 보를 냈을때 이길 수 있는건 바위 밖에 없고
				// 사용자가 바위를 냈을때 이길 수 있는건 가위 밖에 없고
				
				switch(ch) {
					case "가위":
						if (ar[computer] == "보") {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"사용자가 이겼습니다.");
						} else if (ar[index] == ar[computer]) {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"비겼습니다.");
						} else {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"컴퓨가 이겼습니다.");
						} 
						break;
					case "바위":
						if (ar[computer] == "가위") {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"사용자가 이겼습니다.");
						} else if (ar[index] == ar[computer]) {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"비겼습니다.");
						} else {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"컴퓨터가 이겼습니다.");
						}
						break;
					case "보":
						if (ar[computer] == "바위") {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"사용자가 이겼습니다.");
						} else if (ar[index] == ar[computer]) {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"비겼습니다.");
						} else {
							System.out.println("사용자 = "+ch+", "+"컴퓨터 = "+ar[computer]+", "+"컴퓨터가 이겼습니다.");
						}
						break;
				}
			}
		}
		System.out.print("게임을 종료합니다...");
		
	}

}
