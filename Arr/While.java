package Arr;

public class While {
    public static void main(String[] args) {
        // int i = 0, sum = 0;
        // while(i < 10) {
        //     i = i+2;
        //     sum += i;
        // }
        // System.out.print(sum);
        // while(true) {
        //     i = i+2;
        //     sum += i;
        //     if (i >= 10) {
        //         break;
        //     }

        // }

        // do {
        //     i = i+1;
        //     if (i % 2 != 0) continue;
        //     sum += i;
        // } while (i < 10);
        // System.out.print(sum);
        double sum = 0.0;
        double d[] = {1.0, 2.3, 3.4, 5.5};

        // for (int i = 0; i < d.length; i++) {
        //     sum += d[i];
        // }
        // int i = 0;
        // while(i < d.length) {
        //     sum += d[i];
        //     i = i + 1;
        // }
        int i = 0;
        // do {
        //     sum += d[i];
        //     i = i+1;
        // } while(i < d.length);
        // for - each문 쓸때 앞에 변수 사용하는데
        // 이때 변수 타입 꼭 명시해줘야됨.
        for (double n : d) {
            sum += n;
        }
        System.out.print(sum);

    }
}
