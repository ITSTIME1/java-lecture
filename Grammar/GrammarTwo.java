package Grammar;
import java.util.Scanner;
public class GrammarTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int month = sc.nextInt();

    // //     final int $결과 = (month == 11) ? (month >>> 11) : ((month >> ((~(month >>> 3) | (month << 2)) ? 1 : month)));
    // // }

    //     double stoper = 0.0;
        // for(int i =0; true; i++) {} // 무한반복문
        // for(;;) {
        //     stoper += 20.0;
        //     if(stoper == 20.0) {
        //         break;
        //     }
        // }

        // for(int i=0; ; i++) {
            
        // }
        // int n = 0;
        
        // while(true) {
        //     n++;
        //     if (n>=20) break;
        //     if (n%3 ==0) continue;
        //     System.out.print(n+ " ");
        // }
        // int[] array = null;

        // array = new int[5];

        // int max = 0;
        // for(int i = 0; i < array.length; i++) {
        //     array[i] = sc.nextInt();
        //     if (array[i] > max) {
        //         max = array[i];
        //     }
        // }

        // System.out.print("가장 큰 수는 " + max); 

        // double result = 0.0;
        // for (int a : array) {
        //     result += a;
        // }

        // System.out.print(result);

        // for(int a : array) {

        // }

        short[][] a = new short[3][2];
        for (double i = 0.0; i < a.length; i+=1.0) {
            for(double j = 0.0; j < a[(int)i].length; j+=1.0) {
                double input = sc.nextDouble();
                a[(int)i][(int)j] = (short)input;
            }
        }
        
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
        }
        // 프로그램 전체에서 사용이 가능한 스태틱 멤버가 된거고
        double result = Static.pi;
        
    }
}
