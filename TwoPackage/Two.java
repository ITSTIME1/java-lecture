package TwoPackage;


// default 
// 다른패키지에서 접근불가
// 클래스에 올 수 있는건 public default, final ,abstract
class Two {
    Three th = new Three();
    void s() {
        int s = th.a;
    }
    private int same = 1;
    private int num = 0;
    private int sum() {
        return 1;
    }
    public Two() {}


    public int getter() {
        return this.same;
    }
}
