package TwoPackage;




class Four {
    // 현재 Two는 디폴트 클래스
    // 디폴트 클래스에 접근하기 위해서
    // 메소드에서 객체 생성 후 접근을 할때 
    // 당연히 sum protected니까 같은 패키ㅣㅈ에선 public하게 접근
    // 마찬가지로 멤버 필드에 접근하려고 할때 public하게 접근이 가능.
    void f() {
        // 이때는 같은 패키지에 있어도 private기 때문에
        // 접근이 불가능했지 그렇기 때문에
        // getter 나 setter를 ㅌ오해서 접근
        // private에 접근하려면 간접적으로 접근하는 방법밖에 없음.
        Two two = new Two();
        two.sum();
        int a = two.getter();
        System.out.print(two.same);
        
    }
}

public class Three { 
    // protected니까 상속받은 자식클래스에서 접근한다면  
    protected static int a = 218235971;
    public int s = 200;
    public int f = 2000;
    int d = 5000;
    
}



