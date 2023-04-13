package OnePackage;

import TwoPackage.Three;
public class One extends Three{
    public static void main(String[] args) {
        System.out.print(a); 
        // 다른 패키지에 있을때 디폴트에 접근할 수 있나?
        // 접근불가
        Three th = new Three();
        System.out.print(th.f);
        
        // 왜 접근이 안될까?

        // static 클래스의 접근지정자가 default기 때문이다.
        
        double result = Static.pi;
    }
    

}