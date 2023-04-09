package Arr;
import java.util.Scanner;
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 레퍼런스 변수를 생성
        // 초기값은 Null로 초기화 되어 있음;
        // 이 단계는 아직 배열이 생성된게 아니고
        // 변수만 선언한것
        // int[] intArray와 동일
        int intArray[];
        // 5개의 배열을 생성했음 
        intArray = new int[5];
        
        int max = 0;
        for (int i=0; i < 5; i++) {
            System.out.print("숫자를 입력하세요>>");
            intArray[i] = sc.nextInt();
            if (intArray[i] > max) {
                max = intArray[i];
            }

        }
        System.out.print("가장 큰 수는 " + max + "입니다");
        
        sc.close();
    }
}
