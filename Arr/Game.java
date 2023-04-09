package Arr;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true) {
            // 0, 1, 2

            System.out.print("가위 바위 보!>>");
            String user = sc.next();


            
            if (user.equals("그만")) {
                System.out.print("게임을 종료합니다...");
                break;
            }

            int user_d = 0;
            for (int i = 0; i < str.length; i++) {
                if (str[i].equals(user)) {
                    user_d = i;
                    break;
                }
            }

            // 0, 1, 2
            int computer = (int)(Math.random()*3);  
            
            // 비겼을때
            if (user_d == computer) {
                System.out.println("사용자 = " + str[user_d] + ", " + "컴퓨터 = " + str[computer] + ", " + "비겼습니다.");
            
            // 가위 바위
            } else if (user_d == 0 && computer == 1 || user_d == 1 && computer == 0) {
                String winner = null;
                if (user_d == 1) {   
                    winner = "사용자";
                } else {
                    winner = "컴퓨터";
                }
                System.out.println("사용자 = " + str[user_d] + ", " + "컴퓨터 = " + str[computer] + ", " + winner + "가 이겼습니다.");
            
            // 바위 보
            } else if (user_d == 1 && computer == 2 || user_d == 2 || computer == 1) {
                String winner = null;
                if (user_d == 2) {   
                    winner = "사용자";
                } else {
                    winner = "컴퓨터";
                }
                System.out.println("사용자 = " + str[user_d] + ", " + "컴퓨터 = " + str[computer] + ", " + winner + "가 이겼습니다.");
            
            // 가위 보
            } else if(user_d == 0 && computer == 2 || user_d == 2 && computer == 0) {
                String winner = null;
                if (user_d == 2) {   
                    winner = "컴퓨터";
                } else {
                    winner = "사용자";
                }
                System.out.println("사용자 = " + str[user_d] + ", " + "컴퓨터 = " + str[computer] + ", " + winner + "가 이겼습니다.");
            }

        
        }
    }
}
