package Arr;
import java.util.Scanner;
public class Integer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    int tmp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = tmp;
                }
            }
        }

        for (int n : intArray) {
            System.out.print(n + " ");
        }
    }
}
