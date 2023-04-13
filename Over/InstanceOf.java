package Over;

class Person {}

class Student extends Person {}

class Researcher extends Person{}

class Professor extends Researcher {}

// Person이라는 슈퍼클래스 하나가 있고
// Student <-> Person 과 상속관계
// Researcher <-> Person 과 상속관계
// Professor <-> Person 과 상속관계 why? Researcher 가 Person 을 상속받고 있기 때문에 즉 Researcer를 상속받고 있으니까 그 상속바든 클래스가
// Person을 상속받고 있기 때문이다.




public class InstanceOf {
    public static void check(Researcher p) {
        if (p instanceof Person) {
            System.out.print("Person");
        }
        if (p instanceof Student) {
            System.out.print("Student");
        }
        if (p instanceof Researcher) {
            System.out.print("Researcher");
        }
        if (p instanceof Professor) {
            System.out.print("Professor");
        }


    }
    public static void main(String[] args) {
        
        // Student는 Person을 상속받고 있기 때문에
        // 업캐스팅이 가능한데
        // 그랬을때 어떤 타입들이 출력될까
        check(new Professor());
    }
}
