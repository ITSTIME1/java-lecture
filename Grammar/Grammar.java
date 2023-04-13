package Grammar;
import java.util.Scanner;
public class Grammar {

    public static int d (int d, int b) {
        return d+b;
    }

    public static int m(int b, int d) {
        return b-d;
    }
    public static void main(String[] args) {
        char a = '\uae00';
        System.out.print(a);


        // Scanner sc = new Scanner(System.in);
        // // enter를 입력친 부분까지 입력을 받아들인다.
        // System.out.print(sc.nextLine());
        // // 실수 나누기 / 실수 소수점까지 나타냄 

        // // 정수나누기 / 정수 정수로 나타내고
        // System.out.print(4.0/2.1);
        // // int c = 5, b= 3;
        // boolean f = false, s = true;+

        // int result = (c > b) ? (c-b) : (b-c);
        // System.out.print(result);

        // && = And연산
        // || or or연산
        // ^ xor연산
        // ! not 연산

        int d = 5, b=3;

        int reuslt = (d > b) ? m(d, b) : d(b, d);
        System.out.print(reuslt);

        int r = a>>b;
        // MSB 최상위 부호는 시프트전의 최상위 비트로채운다.
        int r = a>>>b;
        // 오른쪽으로b만큼 시프트한다.

        // 최상위 비트의 빈자리는 0으로 채운다.
        // 무조건 양수네
        int c = a << b;
        // a를 b번 왼쪽으로 시프트하는데 이떄 최하위 비트는 0으로채운다.
        int ff = a<<<b;


        switch 문에서 case는 정수, 문자, 문자열을 표현가능하고
        조건식은 안됨 false, true shsfltlrdksehl
        
    }
}
