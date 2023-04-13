package Abstract;

abstract class C {
    abstract void f();
}

public class D extends C{
    void f() {
        System.out.print("good");
    }
    public static void main(String[] args) {
        D d = new D();
        d.f();
    }
}
