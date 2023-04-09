package Arr;
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        // 97~122
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 한 문자를 입력하세요>>");
        String s = sc.next();
        // charAt() 함수를 통해서 첫번재 문자를 읽음
        // index로 받는거네
        // 대신 문자열의 index 0 to length - 1
        char c = s.charAt(0);

        // 이렇게도 가능하네
        for (int i = 97; i <= (int)c; i++) {
            String word = "";
            for (int j = i; j <= (int)c; j++) {
                word += (char)j;
            }
            System.out.println(word);
        }
    }
}
