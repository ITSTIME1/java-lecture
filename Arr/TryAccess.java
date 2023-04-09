package Arr;

public class TryAccess {
    public static void main(String[] args) {
        // -2,147,483,648 ~ 2,147,483,647
        // 정수범위가 넘어가는건 불가능
        // 정수범위가 넘어가면 불가능하다는거
        // int 타입이 아닐경우
        // 그리고 앞에 첫문자가 -나 +는 상관없음

        String s = "koan";
        // 정수범위 parse.Integer 정수범위만 가능하네
        // 0 양의정수 음의정수
        // 음 그렇구만

        try {
            // int n = Integer.parseInt(s);
            // int d = Integer.parseInt(s);
            // System.out.print(d);

        } catch (NumberFormatException e) {
            System.out.print(s + "를 정수로 변환 불가.");

        } finally {
            System.out.print("계산을 끝냅니다.");
        }

    }

}