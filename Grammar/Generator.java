package Grammar;

abstract class C {
    abstract void c();
}

public class Generator extends C {
    void c() {
        System.out.print("c");
    }

    public static void main(String[] args) {
        Generator d = new Generator();
        d.c();
    }
}
