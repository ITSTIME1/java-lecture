package Extend;

class A {
    int i;
}

class B extends A {}

class C extends B  {}

class D extends B {}


public class Extend {
    public static void main(String[] args) {
        System.out.print(new D() instanceof C);    
        System.out.print(new D() instanceof A);    
    }
    
}
