package Arr;

public class ReturnArray {
    // int형 배열을 리턴
    static int[] returnArray() {
        int temp[] = {1, 2, 3, 4, 5};
        // int[5] 배열을 생성하고
        // 그걸 가르키는 temp 레퍼런스 변수를 리턴
        return temp;
    }
    public static void main(String[] args) {
        int intArray[];
        // 배열을 생성하고 가르키고 있는 배열 레퍼런스 변수를 리턴받고
        // intArray는 이제부터 temp가 가르키는 int[5] 배열을 가르키게 된다.
        intArray = returnArray();
        // 이 배열에 접근하기 위해서는
        for(int i=0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }
        int ar[] =null;
        ar[2] = 4;
    }
}
