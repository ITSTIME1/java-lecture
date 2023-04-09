import java.util.Scanner;

class Phone {
	private String name, tel;
	
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
}

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = sc1.nextInt();
		Phone arr[] = new Phone[num];
		
		
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			Phone p = new Phone(sc1.next(), sc1.next());
			arr[i] = p;
		}
		
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			
			System.out.print("검색할 이름>>");
			String name = sc1.next();
			
			if (name.equals("exit")) {
				break;
			}
				
			/* 
			 * isActive는 boolean 데이터 타입으로 true, false 논리를 판단한다.
			 * 만약 배열에서 저장되어 있는 이름의 값과 일치할때 출력문을 출력해주고 더 이상 배열을 돌지 않아도 되므로 break 문을 사용하는데
			 * break를 사용하기전에 미리 isActive = false를 사용해서 배열을 다 탐색하고도 값이 존재하지 않을때만 출력하게 된다.
			 * 따라서 이름을 찾았다면 false로 바꿈으로서 이름이 없다는 출력문을 출력하지 않게되고, 만약 이름을 배열을 다 돌아도 찾지 못했을 경우
			 * isActive = true로 인해서 배열에 없기 때문에 이름이 없다는 출력문을 출력하게 된다.
			 * */
			boolean isActive = true;
			for (int i=0; i < arr.length; i++) {
				// 찾을 이름과 같다면
				if(arr[i].getName().equals(name)) {
					System.out.println(arr[i].getName()+"의 번호는 " + arr[i].getTel() + " 입니다.");
					isActive = false;
					break;
				}
			}
			
			if (isActive == true) {
				System.out.println(name+" 이 없습니다.");		
			}
				
		}
		System.out.print("프로그램을 종료합니다...");
		sc1.close();
		
	}

}
