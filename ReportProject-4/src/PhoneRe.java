import java.util.Scanner;

public class PhoneRe {
	
	private String name, tel;
	
	
	public PhoneRe(String name, String tel) {
		this.name = name;
		this.tel= tel;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getTel() {
		return tel;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름과 전화번호 입력 >>");
		Phone sponge = new Phone(sc.next(), sc.next()); 
		System.out.print("이름과 전화번호 입력 >>");
		Phone jingjing = new Phone(sc.next(), sc.next());
		
		
		System.out.println(sponge.getName()+"의" + " 번호 " + sponge.getTel());
		System.out.println(jingjing.getName()+"의" + " 번호 " + jingjing.getTel());
		
	}

}
