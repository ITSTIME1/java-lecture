package Arr;

public class MeanArray {
    public static void main(String[] args) {
        double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        // 4행 2열

        double sum = 0;
        for (int year = 0; year < score.length; year++) {
            for (int grade = 0; grade < score[year].length; grade++) {
                sum += score[year][grade];
            }
        }
        int year = score.length;
        int grade = score[0].length;
        System.out.print("4년 전체 평점평균 : " + sum/(year*grade));
    }
}
