// 부모 클래스라고 함.
class Person {
	int id = 10;
	String name ="태선";
	
}
// 현재 student는 person 클래스를 부모로두고 상속받고 있다.
class Student extends Person {
	String department = "2반";
	
}
// 현재 Researcher는 person 클래스를 부모로 두고 상속 받고 있다.
class Researcher extends Person {
	String part = "연구파트";	
}

// 얘는 Researcher 클래스를 부모로두고 상속받고 있다.
class Professor extends Researcher {
	String subject = "자율주행";
	
}

public class Test {
	
	public static void print(Person p) {
		// Person의 객체라면
		if (p instanceof Person) {
			System.out.print(p.id + p.name + "Person");
		}
		
		if (p instanceof Student) {
			// 다운캐스팅
			Student s = (Student)p;
			System.out.print(s.department  + "Student");
		}
		if (p instanceof Researcher) {
			// 다운 캐스팅이 되지 않으면 R에 멤버에 접근이 불가능함.
			Researcher r = (Researcher)p;
			System.out.print(r.part + "Researcher");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Researcher obj = new Researcher();
		print(new Student());
	}

}
