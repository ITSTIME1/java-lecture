package Over;

class SuperObject {
    public void paint() {
        System.out.print("1");
        draw();
    }
    public void draw() {
        draw();
        System.out.println("Super Object");
    }

}

class SubObject extends SuperObject {
    public void paint() {
        System.out.print("2");
        super.draw();
        
    }

    // 항상 재정의 메서드를 자식클래스의 오버라이딩된 메소드를 호출하게 되어 있음.
    public void draw() {
        System.out.print("3");
        System.out.println("Sub Object");
    }
}

public class Over {
    public static void main(String[] args) {
        // 업캐스팅을 진행시켜두고
        // 업캐스팅이 되어 있기 때문에
        // 우선적으로 업캐스팅된 객체는 자기 자신의 멤버필드나 메소드의 접근이 불가능하기 떄문에
        // 즉 접근 범위가 변환 타입의 클래스로 한정되기 때문에
        // s.paint() 함수를 호출했을때
        // 부모의 paint()에 접근을 하게 된다
        // 근데 이때 paint() 자체도 오버라이딩된 메소드가 있기 때문에
        // super.draw()를 호출하게 되고
        // draw()메소드를 그 안에서 호출하기 때문에
        // 또 오버라이딩된 메서드가 자식에 있으니까
        // 이때는 자식걸 호출하게 되고 SubObject그리고 나서 부모의 Super Object가 호출되게 되는 형식.
        SuperObject s = new SubObject();
        
        s.paint();
        
    }
}
