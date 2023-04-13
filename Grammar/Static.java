package Grammar;

// 디폴트는 같은 패키지내에서만 public하게 접근가능하다


// final 이 클래스에 붙게되면
// 더 이상 이 클래스는 상속이 불가능하다는 얘기가된다.

final class Static {
    // 프로그램 전체에서 사용이 가능한
    public static final double pi = 3.14;
    

    // 멤버 필드에 붙게되면 더 이상 값의 변경ㅇ ㅣ불가능

    public final int red = 10;


    // 더 이상 오버라이딩 불가능 상속관계에 있을때
    // 메소드를 재정의 할 수 있는걸 말하는데
    // 불가능

    final int g() {
        return 0;
    }
    
}

